import java.util.Scanner;

class a
{

public static void main(String[] args)
{
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number between 1 to 7");
        int k=in.nextInt();
        switch(k)
        {
        case 1: System.out.println("the day is Sunday");
                break;
        case 2: System.out.println("the day is Monday");
                break;
        case 3: System.out.println("the day is Tuesday");
                break;
       case 4: System.out.println("the day is Wednesday");
                break;
      case 5: System.out.println("the day is Thursday");
                break;
       case 6: System.out.println("the day is Friday");
                break;
       case 7: System.out.println("the day is Saturday");
                break;
       }
}
}

