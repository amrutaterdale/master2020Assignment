package master2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class order
{
	int orderid;
	String menuName;
	int price;
	int qtyorderd;
	
	order(int orderid,String menuName,int price,int qtyorderd)
	{
		this.orderid=orderid;
		this.menuName=menuName;
		this.price=price;
		this.qtyorderd=qtyorderd;
	}

	@Override
	public String toString() {
		return "order [orderid=" + orderid + ", menuName=" + menuName + ", price=" + price + ", qtyorderd=" + qtyorderd
				+ "]";
	}
}

public class assign11 {

	public static void main(String[] args) {
		
		order o1=new order(80,"pavbhaji",120,5);
		order o2=new order(90,"grilled sandwitch",72,10);
		order o3=new order(92,"Hakka noodles",220,2);
		order o4=new order(96,"pavbhaji",125,8);
		order o5=new order(101,"grilled sandwitch",70,2);
		order o6=new order(98,"pavbhaji",100,8);

		ArrayList<order>al=new ArrayList<>();
		
		al.add(o1);
		al.add(o2);
		al.add(o3);
		al.add(o4);
		al.add(o5);
		al.add(o6);
		
		Map<String, Float>m=new HashMap<>();
		
		Set<order>s=new HashSet<>(al);
		
		//Set<String> key=al.
		
		
		for(order oo:s)
		{
			float total=0;
			for(order oo1:al)
			{
				
				if(oo.menuName.equalsIgnoreCase(oo1.menuName))
				{
					total=total+(oo1.price*oo1.qtyorderd);
				}
				//Float f=total;
				m.put(oo.menuName,total);
			}
			
		}
		
		System.out.println(m);
	}

}
