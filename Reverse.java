//reverse of a string

import java.util.*;
public class Reverse
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int len,i;
        String str;
        System.out.println("Enter a word: ");
        str=sc.next();
        len=str.length();
        String rev="";
        for(i=len-1;i>=0;i--)
        {
           rev+=str.charAt(i);
        }
        System.out.println(""+rev);
    }
 }
