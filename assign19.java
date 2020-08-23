package master2020;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Student1
{
	int studid;
	String name;
	String qualification;
	int yop;
	boolean placed;
	
	Student1(int studid,String name,String qualification,int yop,boolean placed)
	{
		this.studid= studid;
		this.name= name;
		this.qualification=qualification;
		this.yop= yop;
		this.placed= placed;
	}

	@Override
	public String toString() {
		return "Student [studid=" + studid + ", name=" + name + ", qualification=" + qualification + ", yop=" + yop
				+ ", placed=" + placed + "]";
	}
}

public class assign19 {

	public static void main(String[] args) {
		
		Set<Student1>s=new HashSet<>();
		
		s.add(new Student1(1,"Amruta","BE",2015,false));
		s.add(new Student1(2,"Pooja","BE",2017,true));
		s.add(new Student1(5,"Rahul","MCA",2014,true));
		s.add(new Student1(9,"Amit","BCA",2016,false));
		s.add(new Student1(8,"Rutuja","BE",2018,true));
		
		ArrayList<Student1>s1=new ArrayList<>();
		ArrayList<Student1>s2=new ArrayList<>();
		
		for(Student1 ss:s)
		{
			if(ss.placed==true)
			{
				s1.add(ss);
			}
			else
			{
				s2.add(ss);
			}
		}
		// TODO Auto-generated method stub
		
		System.out.println("***********placed student************");
		System.out.println(s1);
		System.out.println("--------------------");

		System.out.println("***********unplaced student************");
		System.out.println(s2);

	}

}
