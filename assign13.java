package master2020;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class studentt
{
	int sid;
	String name;
	int marks;
	
	studentt(int sid,String name,int marks)
	{
		this.sid=sid;
		this.name=name;
		this.marks=marks;
	}

	@Override
	public String toString() {
		return "studentt [sid=" + sid + ", name=" + name + ", marks=" + marks + "]";
	}
}



public class assign13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		Set<studentt>s1=new LinkedHashSet<>();
		s1.add(new studentt(2,"gouri",56));
		s1.add(new studentt(3,"soniya",45));
		s1.add(new studentt(1,"sonali",78));
		
		//s1.add(new studentt(2,"aniket",89));
		
		
		Set<studentt>s2=new LinkedHashSet<>();
		s2.add(new studentt(1,"gouri",56));
		s2.add(new studentt(3,"soniya",45));
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("enter id");
		int id=sc.nextInt();
		
		List<studentt>al1=new ArrayList<>(s1);
		List<studentt>al2=new ArrayList<>(s2);
		
		boolean flag=false;
		for(int i=0;i<al1.size();i++)
		{
			for(int j=0;j<al2.size();j++)
			{
				if(i==j)
				{
			if((al1.get(i).sid==id && al1.get(i).sid==al2.get(j).sid))
					{
                     flag=true;					
                     }
				}
			
			
		}
		
		}
		
		if(flag==true)
		{
			System.out.println("student having with given id in both sets at same position");
		}
		
		else
		{
			System.out.println("not student having same id at same position in both sets");
		}

	}

}
