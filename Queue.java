import java.util.*;
class Q
 {
    int max,front,rear;
    int[] q;
    Q()
     {
         this.max=5;
         this.q=new int[max];
         this.front=-1;
         this.rear=-1;
     }
         Q(int max)
          {
            this.max=max;
            this.q=new int[max];
            this.front=-1;
            this.rear=-1;
          }

void enqueue(int item)
      {
        if(rear==max-1)
         {
            System.out.println("Overflow");
         }
        else
         {
            if(front==-1 && rear==-1)
              {
                front=0;
              }
            rear++;
            q[rear]=item;
         }
        display();
      }

void dequeue()
     {
            if(front==-1)
          {
            System.out.print("Underflow \n");
          }
            else
         {
            System.out.print(q[front++]+" popped \n");
         }
            display();
        }
void display()
{
                 if(front==-1 && rear==-1 || front>rear)
                    {
                        System.out.print("Queue is Empty \n");
                    }
                else
                {
                     for(int i=front;i<=rear;i++)
                     {
                         System.out.print(q[i]+" ");
                     }
                        System.out.println();
                }
}
 }     

public class Queue
 {
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        Q queue=new Q();
        int ch,item,n;
        do
         {
            System.out.print("1.Enqueue 2.Dequeue 3.Display 4.Exit \n");
            System.out.print("Enter Choice: ");
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
	                        queue.enqueue(item);
	                    }
	                    break;
                    case 2:
	                    queue.dequeue();
	                    break;
                    case 3:
	                    queue.display();
	                    break;
                    case 4:
	                    break;
           }
        }
     while(ch!=4);
    }
 }

 
	
OUTPUT

buntu@ubuntu-H81M-S:~/SCS1051123$ javac Queue.java
ubuntu@ubuntu-H81M-S:~/SCS1051123$ java Queue
1.Enqueue 2.Dequeue 3.Display 4.Exit 
Enter Choice: 1
Enter number of items: 3
Enter item: 1
1 
Enter item: 2
1 2 
Enter item: 3
1 2 3 
1.Enqueue 2.Dequeue 3.Display 4.Exit 
Enter Choice: 3
1 2 3 
1.Enqueue 2.Dequeue 3.Display 4.Exit 
Enter Choice: 2
1 popped 
2 3 
1.Enqueue 2.Dequeue 3.Display 4.Exit 
Enter Choice: 4
