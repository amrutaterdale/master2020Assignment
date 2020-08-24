package thinkitive;

public class longestpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abnamalyalamno";
		
		int max=0;
		 String long_palin="";
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				String n=str.substring(i,j);
				
				String n1="";
				for(int k=n.length()-1;k>=0;k--)
				{
					char ch=(n.charAt(k));
					n1=ch+n1;
				}
			if(n.equalsIgnoreCase(n1))
			{
				if(max<n1.length())
				{
					max=n1.length();
				long_palin=n1;
				}
				
			}
		}
		}
		
		System.out.println(long_palin);

	}

}
