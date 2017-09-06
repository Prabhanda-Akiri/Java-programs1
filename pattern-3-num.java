import java.util.Scanner;

public class A
{
    public static void main(String[] args)
    {
        
        Scanner in=new Scanner(System.in);
        System.out.println("enter the three numbers:");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        if(a>b)
        {
            if(b>c)
            System.out.println("Decreasing order");
            else
            System.out.println("Neither increasing nor decreasing");
         }
         
         if(a<b)
        {
            if(b<c)
            System.out.println("Increasing order");
            else
            System.out.println("Neither increasing nor decreasing");
         }
         
       }
       }


