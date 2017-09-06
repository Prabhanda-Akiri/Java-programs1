import java.util.Scanner;

class produ{
    
    
    int sal(int w){
        return 150*30*w;
    }
}

class hr{
    
    
    
    int sal(int w){
        return 100*30*w;
    }
}

class manag{
    
    
    int sal(int w){
        return 200*30*w;
    }
}



public class U{
    
    public static void main(String[] args){
        
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your department\n1.Mnagement\n2.Production\n3.Consultancy\n");
        int k=0,salary=0;
        k=in.nextInt();
        
        if(k==1){
            System.out.println("enter working hours");
            int h=in.nextInt();
            manag m=new manag();
            salary=salary+m.sal(h);
            
        }
        
        
        if(k==2){
            System.out.println("enter working hours");
            int h=in.nextInt();
            produ p=new produ();
            salary=salary+p.sal(h);
            
        }
        
        
        
        if(k==3){
            System.out.println("enter working hours");
            int h=in.nextInt();
            hr b=new hr();
            salary=salary+b.sal(h);
            
        }
        
        
        System.out.println("Your salary is Rs." + salary +".00/- ");
        
        
        
        
    }
}

