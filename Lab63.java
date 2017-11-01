import java.util.Scanner;

import Mypack1.*;

public class Lab63
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);

		System.out.println("Enter your Name:");
		String n=in.next();

		System.out.println("Enter Roll.no:");
		int r=in.nextInt();

		System.out.println("Enter your attendance percentage:");
		double a=in.nextDouble();


		Mypack1.AttendanceManagement ob=new Mypack1.AttendanceManagement(n,r,a);

		ob.show();
	}
}
