import java.util.Scanner;

interface stackADT
{
	public void push(int a);
	public int pop();
	public void printStack();

}

class Stack implements stackADT
{
	int stck[]=new int[10];
	int tos;

	Stack()
	{
		tos=-1;
	}

	public void push(int item)
	{
		if(tos>=9)
		{
			System.out.println("Stack overflow");
		}

		else
		{
			stck[++tos]=item;
		}
	}

	public int pop()
	{
		if(tos<0)
		{
			System.out.println("Stack underflow");
			return 0;			
		}

		else
		{
			return stck[tos--];
		}

	}

	public void printStack()
	{
		for(int i=0;i<tos+1;i++)
		{
			System.out.println(stck[i]);
		}
	}

}

public class Lab77
{
	public static void main(String[] args)
	{
		Stack s=new Stack();

		Scanner in=new Scanner(System.in);
		System.out.println("Stack has a maximum capacity of 10 elements");

		while(2>1)
		{
			System.out.println("Choose operation\n1.Push\n2.Pop\n3.Quit");
			int k=in.nextInt();

			if(k==1)
			{	
				System.out.println("Enter the element");
				int e=in.nextInt();

				s.push(e);
			}

			else if(k==2)
			{	
				int b=s.pop();
				System.out.println("Here is the popped element:	"+b);
			}

			else
			{
				System.out.println("Here is the final stack:\n\n");
				s.printStack();
				break;
			}

		}
	}
}
