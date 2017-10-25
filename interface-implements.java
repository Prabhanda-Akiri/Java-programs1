
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
		public void m2();
	} 

	interface I2 extends I1
	{
		public void m3();
		public void m6();

	}


	abstract class a implements I2,I1
	{
		public void m1()
		{
			System.out.println("\nInside overriden method m1");
		}

		public void m6()
		{
			System.out.println("\nInside overriden method m6");
		}
	}

	class b extends a
	{

		public void m2()
		{
			System.out.println("\noverriden method m2 in extended class b");
		}

		public void m3()
		{
			System.out.println("\noverriden method m3 in extended class b");
		}
	}
}

public class B
{
	public static void main(String[] args)
	{
		w o=new w();
		w.b o1=o.new b();

		o1.m1();
		o1.m6();

		o1.m2();
		o1.m3();
	}


}
