import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args)
    {
        int i,j,k,sum=0;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the array size");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("enter array elements");
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
            if(a[i]==10)
            sum=sum+a[i];
        }
        if(sum==30)
        System.out.println("yes the sum is 30");
        if(sum!=30)
        System.out.println("no,the sum is not 30");
        
        
    }
}
