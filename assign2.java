package master2020;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class assign2 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
		
		lhm.put("pqr",12);
		lhm.put("rst",43);
		lhm.put("abc",4);
		lhm.put("mno",2);
		
		List<String>al=new ArrayList<>();
		Set<String>k=lhm.keySet();
		for(String ss:k)
		{
			al.add(ss);
		}
		System.out.println(al);
		
		boolean flag=false;
		
		List<String>al1=new ArrayList<>();
		al1.add("abc");
		al1.add("mno");
		System.out.println(al1);
		
		boolean f=true;
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i)!=al1.get(i))
			{
				f=false;
				break;
			}
			
		}
		System.out.println(f);
		
//		

	}

}
