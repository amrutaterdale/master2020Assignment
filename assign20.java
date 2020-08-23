package master2020;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Player
{
	int playerid;
	String name;
	String country;
	String team;
	
	Player(int playerid,
	String name,
	String country,
	String team)
	{
		this.playerid= playerid;
		this.name= name;
		this.country= country;
		this.team=team;
	}

	@Override
	public String toString() {
		return "Player [playerid=" + playerid + ", name=" + name + ", country=" + country + ", team=" + team + "]";
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class assign20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Player> p=new ArrayList<>();
		
		p.add(new Player(1,"Dhoni","India","Chennai Super Kings"));
		p.add(new Player(2,"Warner","Australia","Mumbai Indians"));
		p.add(new Player(3,"Maxwell","Australia","kings eleven Punjab"));
		p.add(new Player(4,"Raina","India","Chennai Super Kings"));
		p.add(new Player(5,"Kohli","India","Royal challengers Banglore"));
		p.add(new Player(6,"Smith","Australia","Mumbai Indians"));
		
		Iterator itr=p.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("***********************");
		
		List<Player> p1=new ArrayList<>();
		for(Player s:p)
		{
			
				int max=1;
				
					if(s.country.contains("Australia"))
					{
						p1.add(s);
				
						
			}
		}
		int max=0;
		String dd=" ";
		for(Player p2:p1)
		{
			int count=0;
			for(Player p3:p1)
			{
				
				if(p2.team==p3.team)
				{
					count++;
					
				}
				if(max<count)
				{
					max=count;
					dd=p3.team;
				}
				
			}
//			System.out.println(p2.team+" "+count);
		}
		
		
		
		System.out.println(dd);
	}	
		
		

	

}
