package master2020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class movie 
{
	int movieid;
	String moviename;
	int rating;
	
	movie(int movieid,String moviename,int rating)
	{
		this.movieid=movieid;
		this.moviename=moviename;
		this.rating=rating;
	}

	@Override
	public String toString() {
		return "movie [movieid=" + movieid + ", moviename=" + moviename + ", rating=" + rating + "]";
	}

//	@Override
//	public int compareTo(movie o) {
//		// TODO Auto-generated method stub
//		return o.rating-this.rating;
//	}
}

class theatre implements Comparable<theatre>
{
	int theatreid;
	String theatrename;
	String location;
	movie movie;
	
	theatre(int theatreid,String theatrename,String location,movie movie)
	{
		this.theatreid=theatreid;
		this.theatrename=theatrename;
		this.location=location;
		this.movie=movie;
	}

	@Override
	public String toString() {
		return "theatre [theatreid=" + theatreid + ", theatrename=" + theatrename + ", location=" + location
				+ ", movie=" + movie + "]";
	}

	@Override
	public int compareTo(theatre o) {
		if(this.movie.rating!=o.movie.rating)
		return(o.movie.rating-this.movie.rating);//this.theatrename.compareTo(t.theatrename));
		else 
			return(this.theatrename.compareTo(o.theatrename));
	}
}

public class assign7 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<theatre>l=new ArrayList<>();
    
    movie m1=new movie(10,"pk",4);
    movie m2=new movie(20,"sholey",5);
    movie m3=new movie(30,"xyz",2);
    movie m4= new movie(40,"krish",4);
    
    theatre t1=new theatre(1,"pvr","pune",m1);
    theatre t2=new theatre(2,"phonix","pune",m2);
    theatre t3=new theatre(3,"carnival","pune",m1);
    theatre t4=new theatre(4,"inox","pune",m3);
    theatre t5=new theatre(5,"city pride","mumbai",m4);
    
    l.add(t1);
    l.add(t2);
    l.add(t3);
    l.add(t4);
    l.add(t5);
    
    Collections.sort(l);
   // System.out.println(l);
    
    for(int i=0;i<l.size();i++)
    {
    System.out.println(l.get(i));
    }
    
    
    
    
    
    
    
	}
}
    
    
    
    
    
    