import java.util.Scanner;

public class D
{
    public static void main(String[] args)
    {
        int i,j;
        Scanner in=new Scanner(System.in);
        System.out.println("1st array size:");
        int m=in.nextInt();
        int a[]=new int[m];
        System.out.println("elements of first array:");
        for(i=0;i<m;i++)
        {
            a[i]=in.nextInt();
        }
        
        System.out.println("2nd array size:");
        int n=in.nextInt();
        int b[]=new int[n];
        System.out.println("elements of first array:");
        for(i=0;i<n;i++)
        {
            b[i]=in.nextInt();
        }
        
        System.out.println("common elements:");
        
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
        {
            if(a[i]==b[j])
            {
               System.out.println(b[j]);
              }
          }
         }
         
         }
         }
