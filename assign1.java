package master2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class assign1 {

	public static void main(String[] args) {
		Book b1=new Book(1,"amruta",100);
		Book b2=new Book(2,"Deepali",200);
		Book b3=new Book(3,"Tejas",150);
		 Book b4=new Book(1,"Atul",205);
		    
		    
		
		
		BookSale bs1=new BookSale(b1,10);
		BookSale bs2=new BookSale(b2,12);
		BookSale bs3=new BookSale(b3,15);
		BookSale bs4=new BookSale(b4,15);
		// TODO Auto-generated method stub
      ArrayList <BookSale> al=new ArrayList<>();
   al.add(bs1);
   al.add(bs2);
   al.add(bs3);
   al.add(bs4);
   
   System.out.println(al);
      Map<Integer,Float> m=new HashMap<>();

      
      for(int i=0;i<al.size();i++)
      {
    	  float prc= (al.get(i).b.price*al.get(i).copiesSold);
    	  int key=al.get(i).b.bookid;
    	  for(int j=i+1;j<al.size();j++)
    	  {
    		  int key1=al.get(j).b.bookid;
    		  float prc1= (al.get(j).b.price*al.get(j).copiesSold);
    		  
    		  if(key==key1)
    		  {
    			  m.put(al.get(i).b.bookid, prc+prc1);
    		  }
    		  else
    		  {
    			  m.put(al.get(i).b.bookid,prc);
    		  }
    		  
    	  }
      }
    
   
    
    
	
//m.put(1, 200f);
//m.put(2, 100f);
//m.put(3, 500f);
System.out.println(m);
	}

}
