import java.util.Scanner;

abstract class a
{
	int a,b,c;

	a()
	{
		a=0;
		b=0;
		c=0;
	}

	abstract int vol();
}

class b extends a
{
	b()
	{
		super();
	}

	void values(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
	}

	int vol()
	{
		return a*b*c;
	}
}


public class A{

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);

		System.out.println("Enter the dimensions of the cuboid: ");
		int x=in.nextInt();
		int y=in.nextInt();
		int z=in.nextInt();

		b ob=new b();

		ob.values(x,y,z);

		System.out.println("Volume returned from the overriden method is: " + ob.vol() + "cubic.units");
	}
}
