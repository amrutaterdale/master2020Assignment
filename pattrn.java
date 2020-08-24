package thinkitive;

import java.util.Scanner;

public class pattrn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows");
		int row=sc.nextInt();
		
		
		for(int i=1;i<=row;i++)
		{
			for(int sp=1;sp<=row-i;sp++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(i*2-1);j++)
			{
				System.out.print("*");
			}
			
			
			System.out.println();
			
			
		}
	}

}
