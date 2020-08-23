package master2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Test
{
	int tid;
	@Override
	public String toString() {
		return "Test [tid=" + tid + ", sid=" + sid + ", marks=" + Arrays.toString(marks) + "]";
	}

	int sid;
	int marks[];
	
	Test(int tid,int sid,int[] marks)
	{
		this.tid=tid;
		this.sid=sid;
		this.marks=marks;
		
	}
}

class student implements Comparable<student>
{
	int sid;
	int totalmarks;
	
	student(int sid,int totalmarks)
	{
		this.sid=sid;
		this.totalmarks=totalmarks;
	}

	@Override
	public String toString() {
		return "student [sid=" + sid + ", totalmarks=" + totalmarks + "]";
	}

	@Override
	public int compareTo(student o) {
		// TODO Auto-generated method stub
		return o.totalmarks-this.totalmarks;
	}
}


public class assign16 {
	
	

	public static void main(String[] args) {
		
		
		ArrayList<Test>al=new ArrayList<>();
		
		int[] m1={15,50,30};
		int[] m2={35,40,30};
		int[] m3={23,50,20};
		int[] m4={12,35,24};
		al.add(new Test(101,1,m1));
		al.add(new Test(106,5,m2));
		al.add(new Test(104,2,m3));
		al.add(new Test(102,7,m4));
		
    Set<student>s=new HashSet();

    for(int i=0;i<al.size();i++)
    {
    	int marks=0;
    	for(int j=0;j<al.get(i).marks.length;j++)
    	{
    		marks=marks+al.get(i).marks[j];
    	}
    	s.add(new student(al.get(i).sid, marks));
    	
    }
    List<student>ss=new ArrayList<>(s);
    Collections.sort(ss);
System.out.println("descending marks");
    for(student st:ss)
    {
    	System.out.println(st);
    }
	}

}
