# Number
import java.io.*;
import java.util.*;
import java.lang.*;
public class Number
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n,i,sum=0;
    n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
        sum=sum+i;
    }
    System.out.println("Sum of  numbers:"+sum);
  }
}
