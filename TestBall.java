public class TestBall
{
	public static void main(String[] args) {
		Ball b1 = new Ball("blue",14);
		System.out.println("color "+b1.getColor()+" radius "+ b1.getRadius());
		b1.setColor("black");
		b1.setRadius(15);
		System.out.println("NEW: "+b1.ToString());
	}
}
class Ball
{
	private String color;
	private int radius;
	Ball(String col,int rad){
		color=col;
		radius=rad;
	}
	public void setColor(String col)
	{
		color=col;
	}
	public String getColor()
	{
		return color;
	}
	public void setRadius(int rad)
	{
		radius=rad;
	}
	public int getRadius()
	{
		return radius;
	}
	public String ToString()
	{
		return color + " with radius " + radius;
	}
}