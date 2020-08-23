package master2020;

import java.util.LinkedList;

public class assign14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>l1=new LinkedList<>();
		LinkedList<Integer>l2=new LinkedList<>();
		
		for(int i=1;i<=6;i++)
		{
		l1.add(i);
		}
		System.out.println(l1);
		
		for(int i=11;i<=44;i+=11)
		{
		l2.add(i);
		}
		System.out.println(l2);
		
		
		LinkedList<Integer>l3=new LinkedList<>();
		
		int a=0;
		
		if(l1.size()>l2.size())
		{
			a=2*l2.size();
		}
		else
		{
			a=2*l1.size();
		}
		
		int b=0;
		int c=0;
		for(int i=0;i<a;i++)
		{
			
			if(i%2==0)
			{
				l3.add(l1.get(b));
				b++;
			}
			else
			{
				l3.add(l2.get(c));
				c++;
			}
		}
		
		if(l1.size()>l2.size())
		{
		for(int i=b;i<l1.size();i++)
		{
			l3.add(l1.get(i));
		}
		}
			else
			{
				for(int i=c;i<l2.size();i++)
				{
				l3.add(l2.get(i));
				}
			}
		
		System.out.println();
//		
	
		
		System.out.println(l3);
		
	}

}
