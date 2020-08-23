package master2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class student2
{
	int sid;
	String sname;
	
	student2(int sid,String sname)
	{
		this.sid=sid;
		this.sname=sname;
	}

	@Override
	public String toString() {
		return "student2 [sid=" + sid + ", sname=" + sname + "]";
	}
}

class course
{
	int cid;
	String cname;
	
	course(int cid,String cname)
	{
		this.cid=cid;
		this.cname=cname;
	}

	@Override
	public String toString() {
		return "course [cid=" + cid + ", cname=" + cname + "]";
	}
}

public class assign10 {

	public static void main(String[] args) {
		
		student2 s1=new student2(1,"Amruta");
		student2 s2=new student2(2,"Mayank");
		student2 s3=new student2(5,"Disha");
		
		ArrayList<course>c1=new ArrayList<>();
		c1.add(new course(10,"Java"));
		c1.add(new course(20,"Angular"));
		
		ArrayList<course>c2=new ArrayList<>();
		c2.add(new course(10,"Java"));
		
		ArrayList<course>c3=new ArrayList<>();
		c3.add(new course(10,"Java"));
		c3.add(new course(20,"Angular"));
		c3.add(new course(30,"Spring"));
		
		Map<student2,ArrayList<course>> m1=new HashMap<>();
		m1.put(s1,c1);
		m1.put(s2,c2);
		m1.put(s3,c3);
		// TODO Auto-generated method stub
//		System.out.println(m1);
		
		Map<Integer,ArrayList<student2>> m2=new HashMap<>();
		
		Set<student2>k=m1.keySet();
		Set<Integer> cr=new HashSet<>();
		for(student2 ss:k)
		{
			for(int j=0;j<m1.get(ss).size();j++)
			{
			cr.add(m1.get(ss).get(j).cid);
			
		}
		}
		System.out.println(cr);
		
		
		for(Integer kk:cr)
		{
			ArrayList<student2>l=new ArrayList<>();
		
			for(student2 ss:k)
			{
				for(int a=0;a<m1.get(ss).size();a++)
				{
				if(kk==m1.get(ss).get(a).cid)
				{
					l.add(ss);
				}
			}
		}
			m2.put(kk,l);
		}
//		System.out.println(m2);
		
		Set<Entry<Integer,ArrayList<student2>>> ss=m2.entrySet();
		
		for(Entry<Integer,ArrayList<student2>> kk:ss)
		{
			System.out.println("key="+kk.getKey()+" "+"value="+kk.getValue());
		}
		
	}
}
		
		
		
//		
		


	
		
		
			
		

	
