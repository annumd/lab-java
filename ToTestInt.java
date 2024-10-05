import java.util.*;
interface Test
{
	int square(int x);
}
class Arithmetic implements Test
{
	public int square(int x)
	{
  		return x*x;
	}
}
class ToTestInt
{
	public static void main(String args[])
	{
  		Scanner sc=new Scanner(System.in);
  		System.out.print("Enter the number:");
  		int a=sc.nextInt();
  		Arithmetic arithmetic=new Arithmetic();
  		int result=arithmetic.square(a);
  		System.out.println("Square of "+a+" is:"+result);
	}
}



OUTPUT

ubuntu@ubuntu-H81M-S:~/SCS1051123$ javac ToTestInt.java
ubuntu@ubuntu-H81M-S:~/SCS1051123$ java ToTestInt
Enter the number:6
Square of 6 is:36
