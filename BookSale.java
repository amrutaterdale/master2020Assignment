package master2020;

public class BookSale {
	Book b;
	int copiesSold;
	public Book getB() {
		return b;
	}
	public void setB(Book b) {
		this.b = b;
	}
	public int getCopiesSold() {
		return copiesSold;
	}
	public void setCopiesSold(int copiesSold) {
		this.copiesSold = copiesSold;
	}
  BookSale(Book b,int copiesSold)
  {
	  
	  this.b=b;
	  this.copiesSold=copiesSold;
  }
@Override
public String toString() {
	return "BookSale [b=" + b + ", copiesSold=" + copiesSold + "]";
}
}
