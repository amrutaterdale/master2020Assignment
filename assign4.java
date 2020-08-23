package master2020;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class stud
{
	int sid;
	@Override
	public String toString() {
		return "stud [sid=" + sid + ", name=" + name + ", course=" + course + "]";
	}

	String name;
	String course;
	
	stud(int sid,String name,String course)
	{
		this.sid=sid;
		this.name=name;
		this.course=course;
	}
}

public class assign4 {
	
	public  static  void checkpassedstudent( HashMap hm)
	{
		HashSet <stud> hs1=new HashSet<>();
	    HashSet<stud> hs2=new HashSet<>();
		Set<stud>k=hm.keySet();
		for(stud ss:k)
		{
			int val=(int) hm.get(ss);

			if(ss.course.equalsIgnoreCase("java")&& val>=50)
			{
				hs1.add(ss);
				//return hs1;
			}
			if(ss.course.equalsIgnoreCase("angular")&& val>=60)
			{
				{
					hs2.add(ss);
					//return hs2;
				}
			}
			
		}
		System.out.println("java passed student");
		System.out.println(hs1);
		System.out.println("*************");
		System.out.println("Angular passed student");
		System.out.println(hs2);
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stud s1=new stud(1,"sonali","Java");
		stud s2=new stud(2,"ratan","Angular");
		stud s3=new stud(3,"soham","Angular");
		stud s4=new stud(4,"disha","Java");
		stud s5=new stud(5,"sanmati","Java");
		
//		HashSet<stud> hs1=new HashSet<>();
//		HashSet<stud> hs2=new HashSet<>();
		
		HashMap<stud,Integer>hm=new HashMap<>();
		hm.put(s1,70);
		hm.put(s2,50);
		hm.put(s3,60);
		hm.put(s4,50);
		hm.put(s5,40);
		
		checkpassedstudent(hm);
		
		
		
		

	}

}
