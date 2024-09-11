//rectangle
import java.util.*;
class Rectangle
{
	static double length,breadth,x1,y1,x2,y2;
	// Method to set the dimensions of the rectangle
	void SetDim(double l,double b)
	{
		l= length;
		b= breadth;
	}
	// Method to calculate the area of the rectangle
	double getArea()
	{
		double area = 0;
		area = length*breadth;
		return area;
	}
	// Method to calculate the perimeter of the rectangle
	double getPerimeter()
	{
		double perimeter = 0;
		perimeter = 2*(length+breadth);
		return perimeter;
	}
	// Method to calculate the diagonal of the rectangle
	double getDiagonal()
	{
		double diagonal=0;
		double sum = (length*length)+(breadth*breadth);
		diagonal = Math.sqrt(sum);
		return diagonal;
	}
	// Method to calculate and print the midpoint of the rectangle
	void MidPoint()
	{
		// Calculate the coordinates of the opposite corner
		double x2=x1+length;
		double y2 = y1+breadth;
		// Calculate the midpoint coordinates
		double x= (x1+x2)/2;
		double y = (y1+y2)/2;
		System.out.println("The midpoint is : ("+x+","+y+") ");
	}
	
	public static void main ( String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Length : ");
		length = sc.nextInt();
		System.out.print("Breadth : ");
		breadth = sc.nextInt();
		System.out.println("-Enter corner coordinates-");
		System.out.print("coordinate 1: ");
		x1 = sc.nextInt();
		System.out.print("coordinate 2: ");
		x2= sc.nextInt();
		Rectangle obj = new Rectangle();
		obj.SetDim(length,breadth);
		obj.getArea();
		obj.getPerimeter();
		obj.getDiagonal();
		obj.MidPoint();
		System.out.println("Area of the rectangle: "+obj.getArea());
		System.out.println("Perimeter of the rectangle : "+obj.getPerimeter());
		System.out.println("Diagonal of the rectangle : "+obj.getDiagonal());
	}
}


//OUPUT

ubuntu@l6sys24:~/SCS1051123$ javac Rectangle.java
ubuntu@l6sys24:~/SCS1051123$ java Rectangle
Length : 5
Breadth : 6
-Enter corner coordinates-
coordinate 1: 3
coordinate 2: 4
The midpoint is : (5.5,3.0) 
Area of the rectangle: 30.0
Perimeter of the rectangle : 22.0
Diagonal of the rectangle : 7.810249675906654
//
