interface I1
{
	public void m1();
	public void m2();
	public void m3();
	public void m4();
}

abstract class a implements I1
{
	public void m1()
	{
		System.out.println("Inside method m1 in class 'a'");
	}

	public void m3()
	{
		System.out.println("inside method m3 in class 'a'");
	}
}

class b extends a
{
	public void m2()
	{
		System.out.println("Inside method m2 in class 'b'");
	}

	public void m4()
	{
		System.out.println("Inside method m4 in class 'b'");
	}
}

public class Lab75
{
	public static void main(String[] args)
	{
		b ob=new b();

		System.out.println("Interface I1 has 4 methods m1,m2,m3 and m4\nTwo methods are being defined in the class 'a' and other 2 in 'b' classes\n");

		ob.m1();
		ob.m2();
		ob.m3();
		ob.m4();

	}
}
