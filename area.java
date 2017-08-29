import java.util.Scanner;

class calc{


double area;

double cone(int r,int l){

        area= (double)3.14 * r*(r + l);
        return area;
}

double cyl(int r,int h){

        area= (double)2*3.14*r*(r+h);
        return area;
}

double rpri(int l,int w,int h){
        area=(double)2*(w*l+w*h+l*h);
        return area;
}
double pyra(int p,int l){
        area=(double)0.5*p*l;
        return area;
}
double hemi(int r){
        area=(double)2*3.14*r*r;
        return area;
}
}

class e{
public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("choose the object:\n1.cone\n2.cylinder\n3.rectangular prism\n4.pyramid\n5.hemisphere\n");
        int k=in.nextInt();
        double a;
        calc p=new calc();
        System.out.println("enter the parameters");
        int r=in.nextInt();
        int l=in.nextInt();
        int h=in.nextInt();

        switch(k)
        {
        case 1: a=p.cone(r,l);
                System.out.println("area of the cone is " + a + "sq.units");
                break;
        case 2: a=p.cyl(r,l);
                System.out.println("area of the cylinder is " + a + "sq.units");
                break;
        case 3: a=p.rpri(r,l,h);
                System.out.println("area of the rectangular prism is " + a + "sq.units");
                break;
        case 4: a=p.pyra(r,l);
                System.out.println("area of the pyramid is " + a + "sq.units");
                break;
        case 5: a=p.hemi(r);
                System.out.println("area of the hemisphere is " + a + "sq.units");
                break;
        }
}
}
