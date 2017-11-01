package Mypack2;

public class Add
{
	int a;

	public Add(int v)
	{
		a=v;
	}

	public void add(int b)
	{
		System.out.println("The package variable 'a' is added to 'b' of external class");

		System.out.println("a+b:	"+(a+b));
	}
}
