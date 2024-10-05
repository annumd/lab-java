abstract class Shape
{
	abstract void noofsides();
}
class Rectangle extends Shape
{
	void noofsides()
	{
		System.out.println("Rectangle has 4 sides");
	}
}
class Triangle extends Shape
{
	void noofsides()
	{
		System.out.println("Triangle has 3 sides");
	}
}
class Hexagon extends Shape
{
	void noofsides()
	{
		System.out.println("Hexagon has 6 sides");
	}
}
public class Abt
{
	public static void main(String[] args)
	{
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		Hexagon h=new Hexagon();
		r.noofsides();
		t.noofsides();
		h.noofsides();
	}

OUTPUT
ubuntu@ubuntu-H81M-S:~/SCS1051123$ javac Abt.java
ubuntu@ubuntu-H81M-S:~/SCS1051123$ java Abt
Rectangle has 4 sides
Triangle has 3 sides
Hexagon has 6 sides
