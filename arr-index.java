import java.util.Scanner;

class c
{

public static void main(String[] args)
{
        int i;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements of the array:");
        for(i=0;i<n;i++)
        {
         a[i]=in.nextInt();
        }

        for(i=0;i<n;i++)
        {
        System.out.println("the index of the element" + a[i] + "is" + i);
        }
}
}
