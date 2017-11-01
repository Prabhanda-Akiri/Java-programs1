import java.util.Scanner;
import Mypack3.*;

public class Lab74
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);

		Mypack3.Pass ob=new Mypack3.Pass();

		int a=ob.show();

		System.out.println("\nInside the external class\nThe value of 'a' is:	"+a);

		System.out.println("enter a value to multiply with 'a':");

		int b=in.nextInt();

		System.out.println("The product is:	"+a*b);
	}
}
