package master2020;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

//import Hashmap.Stud1;

public class assign12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String>m=new HashMap<>();
		
		m.put("109876545656", "BJP");
		m.put("789034567543", "NCP");
		m.put("912367542390", "CONG");
		m.put("776891254390", "SS");
		m.put("956123546709", "OTHER");
		m.put("889030334990", "BJP");
		m.put("998757535467", "SS");
		m.put("213465468976", "BJP");
		m.put("954556743211", "NCP");
		
		Map<String,Integer>m2=new HashMap<>();
		
		Set<String>party=new HashSet<>();
		
		Set<String>key=m.keySet();
		for(String s:key)
		{
			party.add(m.get(s));
		}
		System.out.println(party);
		
		
		
		for(String p:party)
		{
			int count=0;
			for(String s:key)
			{
				if(p==m.get(s))
				{
					count++;
				}
			}
			m2.put(p,count);
		}
		
		System.out.println(m2);
//		
	}
}
