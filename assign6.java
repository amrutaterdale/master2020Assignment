package master2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class studt
{
	int rollno;
	String name;
	int marks;
	
	studt(int rollno,String name,int marks)
	{
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
	}

	@Override
	public String toString() {
		return "studt [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
}

class Rollno
{
	int rollno;
	
	Rollno(int rollno)
	{
		this.rollno=rollno;
	}

	@Override
	public String toString() {
		return "Rollno [rollno=" + rollno + "]";
	}
}

public class assign6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<studt>st=new HashSet<>();
		
		studt s1=new studt(1,"Amruta",45);
		studt s2=new studt(10,"aditya",65);
		studt s3=new studt(22,"kishori",45);
		studt s4=new studt(14,"dipak",14);
		studt s5=new studt(20,"keval",45);
		studt s6=new studt(15,"sanskar",65);
		
//		List<Rollno> l=new ArrayList<>();
		
		
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		st.add(s5);
		st.add(s6);
		
		Map<Integer,List<Rollno>> m=new HashMap<>();
		
		for(studt ss:st)
		{
    	List<Rollno>l=new ArrayList<>();
			for(studt ss1:st)
			{
				if(ss.marks==ss1.marks)
				{
					Rollno r=new Rollno(ss1.rollno);
					l.add(r);
					System.out.println(r);
				}
			}
			m.put(ss.marks,l);
		}
		
		
		System.out.println(m);

	}

}
