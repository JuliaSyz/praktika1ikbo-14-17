public class TestBook
{
	public static void main(String[] args)
	{
		Book b1 = new Book("Dashner","Maze Runner",2009);
		System.out.println(b1.getA());
		b1.setN("The Death Cure");
		b1.setY(2011);
		System.out.println("new " +b1.ToString());
	}
}
class Book
{
	private String aothor;
	private String name;
	private int year;
	Book(String aothor,String name,int year)
	{
		this.aothor=aothor;
		this.name=name;
		this.year = year;
	}
	public String getA()
	{
		return aothor;
	}
	public String getN()
	{
		return name;
	}
	public int getY()
	{
		return year;
	}
	public void setN(String name)
	{
		this.name=name;
	}
	public void setY(int year)
	{
		this.year = year;
	}
	public String ToString()
	{
		return "Aothor: "+aothor+ " name: "+ name + " Year "+year;
	}
}