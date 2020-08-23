package master2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class stude
{
	int sid;
	String name;
	List<String> hobby;
	
	stude(int sid,String name,List<String>hobby)
	{
		this.sid=sid;
		this.name=name;
		this.hobby=hobby;
	}

	@Override
	public String toString() {
		return "stude [sid=" + sid + ", name=" + name + ", hobby=" + hobby + "]";
	}
	
}

public class assign8 {

	public static void main(String[] args) {
		
		List<String>l1=new ArrayList<>();
		l1.add("cricket");
		l1.add("football");
		
		List<String>l2=new ArrayList<>();
		l2.add("carrom");
		l2.add("chess");
		l2.add("cricket");
		
		List<String>l3=new ArrayList<>();
		l3.add("football");
		l3.add("chess");
		l3.add("reading");
		l3.add("cricket");
		
		
		
		stude s1=new stude(2,"amol",l1);
		stude s2=new stude(5,"sanchali",l2);
		stude s3=new stude(8,"aditya",l3);
		
		stude[] sarr= {s1,s2,s3};
		
		List<String>l=new ArrayList<>();
		for(int i=0;i<sarr.length;i++)
		{
			l.addAll(sarr[i].hobby);
		}
		Set <String>ss=new HashSet<>(l);
//		System.out.println(ss);
		
		Map<String,List<stude>>m=new HashMap<>();
		
		int max=0;
		String str="";
		
		for(String s:ss)
		{
			int count=0;
			
			List<stude>st=new ArrayList<>();
			for(int i=0;i<sarr.length;i++)
			{
				for(int j=0;j<sarr[i].hobby.size();j++)
				{
				if(s==sarr[i].hobby.get(j))
				{
					count++;
					st.add(sarr[i]);
				}
				
			
				if(max<count)
				{
					max=count;
					str=s;
				}
				}
				
				m.put(s,st);
			
		}
//			System.out.println(count);
		
	}
		Set<Entry<String,List<stude>>>sz=m.entrySet();
		for(Entry<String,List<stude>> ee:sz)
		{
		System.out.println(ee.getKey()+" "+ee.getValue());
		}
		System.out.println("most common game="+str);

	}

}
