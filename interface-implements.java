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

Interface I1
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	abstract void m4();
} 

Interface I2 extends I1
{
	abstract void m6();
	abstract void m7();
}


abstract class a implements I2
{
	void m1()
	{
		System.out.println("Inside overriden method m1");
	}

	void m6()
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
