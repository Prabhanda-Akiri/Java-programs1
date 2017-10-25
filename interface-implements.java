
import java.util.Scanner;

class w
{
	int a,b,c;

	w()
	{
		a=0;
		b=0;
		c=0;
	}

	interface I1
	{
		public void m1();
	} 

	interface I2 extends I1
	{
		public void m6();

	}


	class a implements I2,I1
	{
		public void m1()
		{
			System.out.println("Inside overriden method m1");
		}

		public void m6()
		{
			System.out.println("Inside overriden method m6");
		}
	}
}

public class B
{
	public static void main(String[] args)
	{
		w o=new w();
		w.a o1=o.new a();

		o1.m1();
		o1.m6();
	}


}
