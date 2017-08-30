import java.util.Scanner;

class calc{


double area;

double ar(int r,int l){

        area= (double)3.14 * r*(r + l);
        return area;
}

double ar(int r,double h){

        area= (double)2*3.14*r*(r+h);
        return area;
}

double ar(int l,int w,int h){
        area=(double)2*(w*l+w*h+l*h);
        return area;
}
double ar(double p,int l){
        area=(double)0.5*p*l;
        return area;
}
double ar(int r){
        area=(double)2*3.14*r*r;
        return area;
}
}

public class e{
public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("choose the object:\n1.cone\n2.cylinder\n3.rectangular prism\n4.pyramid\n5.hemisphere\n");
        int k=in.nextInt();
        double a;
        calc p=new calc();
        

        switch(k)
        {
        case 1: System.out.println("enter the parameters");
                int r=in.nextInt();
                 int l=in.nextInt();
                a=p.ar(r,l);
                System.out.println("area of the cone is " + a + "sq.units");
                break;
        case 2: System.out.println("enter the parameters");
                int i=in.nextInt();
                double b=in.nextDouble();
                a=p.ar(i,b);
                System.out.println("area of the cylinder is " + a + "sq.units");
                break;
        case 3: System.out.println("enter the parameters");
                int c=in.nextInt();
                int d=in.nextInt();
                int e=in.nextInt();
                a=p.ar(c,d,e);
                System.out.println("area of the rectangular prism is " + a + "sq.units");
                break;
        case 4: System.out.println("enter the parameters");
                double f=in.nextDouble();
                int g=in.nextInt();
                a=p.ar(f,g);
                System.out.println("area of the pyramid is " + a + "sq.units");
                break;
        case 5: System.out.println("enter the parameters");
                int z=in.nextInt();
                a=p.ar(z);
                System.out.println("area of the hemisphere is " + a + "sq.units");
                break;
        }
}
}
