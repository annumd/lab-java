import java.util.*;

class Stk

{

    int max,top;

    int[] stk_arr;

    Stk()

     {

        this.max=5;

        this.stk_arr=new int[max];

        this.top=-1;

     }

     Stk(int max)

      {

            this.max=max;

            this.stk_arr=new int[max];

            this.top=-1;

      }

     

void push(int item)

 {

    if(top==max-1)

     {

        System.out.print("Overflow \n");

     }

    else

     {

        stk_arr[++top]=item;

        display();

 

     }

 }

 

void pop()

{

    if(top==-1)

     {

        System.out.println("Underflow");

     }

    else

     {

        System.out.println(stk_arr[top--]+" is popped");

        display();

     }

}

 

void display()

{

    if(top==-1)

     {

        System.out.println("No Elements in Stack");

     }

    else

     {

        System.out.println("Elements in Stack");

        for(int i=0;i<=top;i++)

        {

            System.out.print(stk_arr[i]+" ");

        }

        System.out.println();

     }

}

}

 

 

public class Stack

{

    public static void main(String[] args)

     {

            Scanner sc=new Scanner(System.in);

            Stk stack=new Stk();

            int ch,item,n;

            do

            {

                System.out.println("1.Push 2.Pop 3.Display 4.Exit");

 

                    System.out.print("Enter choice: ");

                    ch=sc.nextInt();

                    switch(ch)

                    {

                        case 1:

                        System.out.print("Enter number of items: ");

                        n=sc.nextInt();

                        for(int i=0;i<n;i++)

                        {

                                System.out.print("Enter item: ");

                                item=sc.nextInt();

                                stack.push(item);

                        }

                        break;

                        case 2:

                        stack.pop();

                        break;

                        case 3:

                        stack.display();

                        break;

                        case 4:

                        break;

                        default:

                        System.out.print("Invalid Choice");

                    }

         }

         while(ch!=4);

    }

}


OUTPUT

ubuntu@ubuntu-H81M-S:~/SCS1051123$ javac Stack.java
ubuntu@ubuntu-H81M-S:~/SCS1051123$ java Stack
1.Push 2.Pop 3.Display 4.Exit
Enter choice: 1
Enter number of items: 4
Enter item: 1
Elements in Stack
1 
Enter item: 2
Elements in Stack
1 2 
Enter item: 3
Elements in Stack
1 2 3 
Enter item: 4
Elements in Stack
1 2 3 4 
1.Push 2.Pop 3.Display 4.Exit
Enter choice: 3
Elements in Stack
1 2 3 4 
1.Push 2.Pop 3.Display 4.Exit
Enter choice: 2
4 is popped
Elements in Stack
1 2 3 
1.Push 2.Pop 3.Display 4.Exit
Enter choice: 2
3 is popped
Elements in Stack
1 2 
1.Push 2.Pop 3.Display 4.Exit
Enter choice: 2
2 is popped
Elements in Stack
1 
1.Push 2.Pop 3.Display 4.Exit
Enter choice: 2
1 is popped
No Elements in Stack
1.Push 2.Pop 3.Display 4.Exit
Enter choice: 4
