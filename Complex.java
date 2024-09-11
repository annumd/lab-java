//Complex.java
import java.util.*;
class Complex 
{
    	int real, img;
	//method for addition
    	static void Add(Complex c1, Complex c2) 
    	{
        	int res_real = c1.real + c2.real;
        	int res_img = c1.img + c2.img;
        	System.out.println(c1.real + "+" + c1.img + "i + " + c2.real + "+" + c2.img + "i = " + res_real + "+" + res_img + "i");
    	}
	//method for subtraction
    	static void Sub(Complex c1, Complex c2) 
    	{
        		int res_real = c1.real - c2.real;
        		int res_img = c1.img - c2.img;
        		System.out.println(c1.real + "+" + c1.img + "i - " + c2.real + "+" + c2.img + "i = " + res_real + "+" + res_img + "i");
    	}
	//method for product
    	static void Pro(Complex c1, Complex c2) 
    	{
        		int res_real = (c1.real * c2.real) - (c1.img * c2.img);
        		int res_img = (c1.real * c2.img) + (c1.img * c2.real);
        		System.out.println(c1.real + "+" + c1.img + "i * " + c2.real + "+" + c2.img + "i = " + res_real + "+" + res_img + "i");
    	}

    	public static void main(String[] args) 
    	{
        		Complex one = new Complex();
        		Complex two = new Complex();
        		Scanner sc = new Scanner(System.in);
		//read complex 1
        		System.out.print("Enter Real part of Number One: ");
        		one.real = sc.nextInt();
        		System.out.print("Enter Imaginary part of Number One: ");
        		one.img = sc.nextInt();
		//read complex 2
        		System.out.print("Enter Real part of Number Two: ");
        		two.real = sc.nextInt();
        		System.out.print("Enter Imaginary part of Number Two: ");
        		two.img = sc.nextInt();

        		System.out.print("Addition of One and Two: ");
        		Add(one, two);

        		System.out.print("Subtraction of One and Two: ");
        		Sub(one, two);

        		System.out.print("Product of One and Two: ");
        		Pro(one, two);
        		
      
    }
}


OUTPUT

    ubuntu@l6sys24:~/SCS1051123$ javac Complex.java
ubuntu@l6sys24:~/SCS1051123$ java Complex
Enter Real part of Number One: 4
Enter Imaginary part of Number One: 5
Enter Real part of Number Two: 6
Enter Imaginary part of Number Two: 7
Addition of One and Two: 4+5i + 6+7i = 10+12i
Subtraction of One and Two: 4+5i - 6+7i = -2+-2i
Product of One and Two: 4+5i * 6+7i = -11+58i
