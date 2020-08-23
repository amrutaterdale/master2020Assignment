package master2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class customer
{
	int cid;
	String name;
	int[] items;
	
	customer(int cid,String name,int[] items)
	{
		this.cid=cid;
		this.name=name;
		this.items=items;
	}

	@Override
	public String toString() {
		return "customer [cid=" + cid + ", name=" + name + ", items=" + Arrays.toString(items) + "]";
	}
}

public class assign5 {

	public static void main(String[] args) {
		
		int[] i1= {1,2,7};
	    int [] i2= {7,8};
		int[] i3= {1,4,6,2};
		
		customer c1=new customer(1,"harsh",i1);
		customer c2=new customer(2,"arohi",i3);
		customer c3=new customer(3,"tejas",i1);
		customer c4=new customer(2,"arohi",i2);
		customer c5=new customer(1,"harsh",i2);
		
		ArrayList<customer>c=new ArrayList<>();
		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.add(c4);
		c.add(c5);
//		System.out.println(c);
		Set<customer>s=new HashSet<>();
		
		Set<Integer>itm=new HashSet<>();
		
		
		for(customer it:c)
		{
			itm.add(it.cid);
		}
		
		
		for(Integer i:itm)
		{
			int[] arr= {};
			String str="";

			int total=0;
			
			int cnt=0;
			
			for(customer al1:c)
			{
				//int cnt=0;
				
				
				if(i==al1.cid)
				{
					//int cn//t=0;
					 total=total+al1.items.length;
					arr=new int[total]; 
//					for(int m=0;m<total;m++)
//					{
//						arr[m]=al1.items[i];
//					}
					
					int newArr[]= {};
					int k=0;
					while(k<al1.items.length)
					{
					for(int j=cnt;j<total;j++)
					{
						
				arr[j]=al1.items[k];
				k++;
				cnt=total;
				
//				newArr=new int[total];
//				for(int p=0;p<arr.length;p++)
//				{
//					newArr[p]=arr[p];
//				}
					}
					
						
					}
					str=al1.name;
					cnt=total;
//					//cnt=arr.length;
//					total=arr.length;
					}
					
					
				}
				
		
			s.add(new customer(i,str,arr));
		}
		System.out.println(s);
	}

		
	}



