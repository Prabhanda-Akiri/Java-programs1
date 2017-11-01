import java.util.Scanner;
import Mypack2.*;

public class Lab73
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);

		System.out.println("Enter the values of a and b");

		int a=in.nextInt();
		int b=in.nextInt();

		Mypack2.Add ob=new Mypack2.Add(a);

		ob.add(b);
	}
}
