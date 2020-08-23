package master2020;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class assign18 {
	
	 static ArrayList<String>al1=new ArrayList<>();
	 
	 public static void copylist(ArrayList al)
	 {
		 al1.addAll(al);
	 }
	
	public static int checkvalue(String str)
	{
		int value=0;
		for(int i=0;i<al1.size();i++)
		{
			
			int k=al1.get(i).indexOf('+');
			String str1=al1.get(i).substring(0,k);
			
			if(str.equalsIgnoreCase(str1))
			{
			String val=al1.get(i).substring(k,al1.get(i).length());
			 value=Integer.parseInt(val);
			
		}
		}
		
		return value;
		
	}
	
	
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>al=new ArrayList<>();
     	al.add("A+2");
		al.add("B+12");
		al.add("D+4");
		al.add("DD+5");
		
		copylist(al);
		
Set<String>s=new HashSet<>();
		
		for(String ss:al)
		{
			int i=ss.indexOf('+');
			String str=ss.substring(0,i);
			s.add(str);
		}
		for(String key:s)
		{
			System.out.println("value="+checkvalue(key));
		}
		


	}

}
