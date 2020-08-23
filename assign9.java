package master2020;

import java.util.ArrayList;

class Employee
{
	String name;
	int empid;
	int mgrid;
	
	Employee(String name,int empid,int mgrid)
	{
		this.name=name;
		this.empid=empid;
		this.mgrid=mgrid;
	}
}

public class assign9 {

	public static void main(String[] args) {
		
		ArrayList<Employee>e=new ArrayList<>();
		e.add(new Employee("Meena",2,1));
		e.add(new Employee("Dhiraj",3,2));
		e.add(new Employee("Priya",1,0));
		e.add(new Employee("Pratik",4,2));
		e.add(new Employee("Rahul",5,3));
		// TODO Auto-generated method stub
		boolean flag=false;
		
		for(Employee el:e)
		{
			for(Employee m:e)
			{
				if(el.empid==m.mgrid)
				{
					System.out.println("employee_name="+m.name+" "+"empid="+m.empid+" "+"manager="+el.name);
				}
				
				
				
				
			}
		}
			
			for(Employee a:e)
			{
				if(a.mgrid==0)
				{
					//System.out.println();
					System.out.println("employee_name="+a.name+" "+"empid="+a.empid+" "+"manager="+a.name);
				}
			}
			
			

		}

	}

