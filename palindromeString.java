import java.util.*;
public class PalindromeString
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
        if(rev.equals(str))
        {
            System.out.println("it is a palindrome.");
        }
        else
        {
            System.out.println("it is not a palindrome.");
        }
        
        
    }
 }
