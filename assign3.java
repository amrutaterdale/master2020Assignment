package master2020;

import java.util.Collections;
import java.util.LinkedList;

public class assign3 {

	public static void main(String[] args) {

		LinkedList<Integer> l=new LinkedList();
 l.add(2);
 l.add(5);
 l.add(3);
 l.add(9);
 Collections.sort(l);
 System.out.println(l);
 int a=l.get(0);
 
 
  while(a<l.get(l.size()-1))
			 {
	  for(int i=0;i<l.size();i++)
	  {
	 	
		 if(l.get(i)==a)
		 {
			 a++;
			 continue;
		 }
	 
	
		 
	 
	 else
	 {
		 System.out.println(a);
		 a++;
	 }
	 }
	
 }
 }
	}


