import java.util.Scanner;

class details{
    
    String na;
    int no;
    int s;

        void sem1()
        {
            Scanner in=new Scanner(System.in);
        System.out.println("enter the name");
        na=in.nextLine();
        System.out.println("enter the number");
        no=in.nextInt();
        System.out.println("enter sem 1 %:");
        s=in.nextInt();
        }
        
        void sem2()
        {
            Scanner in=new Scanner(System.in);
        System.out.println("enter the name");
        na=in.nextLine();
        System.out.println("enter the number");
        no=in.nextInt();
        System.out.println("enter sem 2 %:");
        s=in.nextInt();
        }
        
}

public class d{

public static void main(String[] args)
{
        details d=new details();
        Scanner in=new Scanner(System.in);
        System.out.println("select \n1.sem 1\n2.sem2");
        int k=in.nextInt();
        if(k==1)
        d.sem1();
        else
        d.sem2();
        System.out.println("student name is " + d.na + " student number is " + d.no + " sem marks are " + d.s + "% ");
}}


