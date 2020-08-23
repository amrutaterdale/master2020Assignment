package master2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class member
{
	int memberid;
	int wing_flatno;
	String name;
	
	member(int memberid,int wing_flatno,String name)
	{
		this.memberid=memberid;
		this.wing_flatno=wing_flatno;
		this.name=name;
	}

	@Override
	public String toString() {
		return "member [memberid=" + memberid + ", wing_flatno=" + wing_flatno + ", name=" + name + "]";
	}
}

public class assign15 {

	public static void main(String[] args) {

		ArrayList<member>al=new ArrayList<>();
		
		member m1=new member(1,205,"shashank");
		member m2=new member(4,200,"pooja");
		member m3=new member(3,205,"shlok");
		member m4=new member(8,201,"arohi");
		member m5=new member(6,203,"mayank");
		member m6=new member(9,201,"arush");
		
		al.add(m1);
		al.add(m2);
		al.add(m3);
		al.add(m4);
		al.add(m5);
		al.add(m6);
		
		Map<Integer,List<String>>m=new HashMap<>();
		
		Set<Integer>s=new HashSet<>();
		
		for(member k:al)
		{
			s.add(k.wing_flatno);
		}
//		System.out.println(s);
		
		
		for(Integer i:s)
		{
			List<String>ll=new ArrayList<>();
			for(member mb:al)
			{
				if(i==mb.wing_flatno)
				{
					ll.add(mb.name);
				}
			}
			m.put(i,ll);
		}
		
		
	System.out.println(m);	
		
	}

}
