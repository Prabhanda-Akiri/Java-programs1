import java.util.Scanner;
class d{
    
    int min(int x,int y)
    {
        return (x > y)?y:x;
    }
    int max(int x,int y)
    {
        return (x > y)?x:y;
    }
    int length(int a[],int n)
    {
        int i,j,mn,mx,l;
        l=1;
        for (i = 0; i < n-1; i++)
        {
            mn=a[i];
            mx=a[i];
            for (j = i+1; j < n; j++)
            {
                mn=min(mn,a[j]);
                mx=max(mx,a[j]);
                
                if((mx-mn)==j-i)
                {
                    l=max(l,mx-mn+1);
                }
            }
        }
        return l;
    }
}
public class a{ 

public static void main(String[] args)
{
        d large=new d();
        Scanner in=new Scanner(System.in);
        System.out.println("enter the array size");
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int l=large.length(a,n);
        
        System.out.println("length of the largest contagious subarray is " + l + " the length of the shorest subarray is 1 ");
}}

