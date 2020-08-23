package master2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class assign17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al=new ArrayList<>();
		al.add("A+2");
		al.add("B+12");
		al.add("D+4");
		al.add("DD+5");
		al.add("A+34");
		al.add("A+9");
		
		Set<String>s=new HashSet<>();
		
		for(String ss:al)
		{
			int i=ss.indexOf('+');
			String str=ss.substring(0,i);
			s.add(str);
		}
//		System.out.println(s);
		
		Map<String,Integer>m=new HashMap<>();
		
		for(String k:s)
		{
			int total=0;
			for(String k1:al)
			{
				int i=k1.indexOf('+');
				String st=k1.substring(0, i);
				
				if(k.equalsIgnoreCase(st))
				{
					String in=k1.substring(i, k1.length());
					total= total+Integer.parseInt(in);
				
				}
				m.put(k,total);
			}
		}
		
		

System.out.println(m);
	}

}
