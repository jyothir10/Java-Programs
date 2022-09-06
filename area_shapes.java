import java.math.*;
class area_shapes{
    public static void main(String args[]){
        shapes a = new shapes();
        a.area(10);
        a.area(2,4);
        a.area(5,4,3);
    }
}
class shapes{
    double area,s;
    void area(double r){
        System.out.println("Area of circle= :"+(3.14*r*r));
    }
    void area(double l,double b){
        System.out.println("Area of rectangle= :"+(l*b));
    }
    void area(double a,double b,double c){
        s= (a+b+c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of triangle= :"+area);
    }
}
