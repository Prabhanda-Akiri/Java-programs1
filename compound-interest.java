import java.util.Scanner;

public class B
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter principle\nrate\ntime");
        double pr=in.nextDouble();
        int r=in.nextInt();
        int t=in.nextInt();
        int i,j;
        double a,p=1;
        System.out.println("Years       FutureValue");
        for(i=0;i<t;i++)
        {
            for(j=0;j<12;j++)
            {
                p=p*(1+(double)r/100/12);
               }
            
            a=pr*p;
            System.out.println(i+1 + "    Rs." + a);
           }
           
           }}
