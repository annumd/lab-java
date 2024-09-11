import java.util.*;

class Complex {
    int real, img;

    static void Add(Complex c1, Complex c2) {
        int res_real = c1.real + c2.real;
        int res_img = c1.img + c2.img;
        System.out.println(c1.real + "+" + c1.img + "i + " + c2.real + "+" + c2.img + "i = " + res_real + "+" + res_img + "i");
    }

    static void Sub(Complex c1, Complex c2) {
        int res_real = c1.real - c2.real;
        int res_img = c1.img - c2.img;
        System.out.println(c1.real + "+" + c1.img + "i - " + c2.real + "+" + c2.img + "i = " + res_real + "+" + res_img + "i");
    }

    static void Pro(Complex c1, Complex c2) {
        int res_real = (c1.real * c2.real) - (c1.img * c2.img);
        int res_img = (c1.real * c2.img) + (c1.img * c2.real);
        System.out.println(c1.real + "+" + c1.img + "i * " + c2.real + "+" + c2.img + "i = " + res_real + "+" + res_img + "i");
    }

    public static void main(String[] args) {
        Complex one = new Complex();
        Complex two = new Complex();
        Scanner sd = new Scanner(System.in);

        System.out.println("Enter Real part of Number One:");
        one.real = sd.nextInt();
        System.out.println("Enter Imaginary part of Number One:");
        one.img = sd.nextInt();

        System.out.println("Enter Real part of Number Two:");
        two.real = sd.nextInt();
        System.out.println("Enter Imaginary part of Number Two:");
        two.img = sd.nextInt();

        System.out.println("Addition of One and Two:");
        Add(one, two);

        System.out.println("Subtraction of One and Two:");
        Sub(one, two);

        System.out.println("Product of One and Two:");
        Pro(one, two);

        sd.close();
    }
}

OUTPUT

  ubuntu@l6sys24:~/SCS1051123$ javac Complex.java
ubuntu@l6sys24:~/SCS1051123$ java Complex
Enter Real part of Number One:
3
Enter Imaginary part of Number One:
4
Enter Real part of Number Two:
1
Enter Imaginary part of Number Two:
2
Addition of One and Two:
3+4i + 1+2i = 4+6i
Subtraction of One and Two:
3+4i - 1+2i = 2+2i
Product of One and Two:
3+4i * 1+2i = -5+10i
