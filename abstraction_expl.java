class abstraction_expl{
    public static void main(String args[]){
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Hexagon h = new Hexagon();
        r.numberOfSides();
        t.numberOfSides();
        h.numberOfSides();
    }
}
abstract class Shape{
    abstract void numberOfSides();
}
class Rectangle extends Shape{
    void numberOfSides(){
        System.out.println("No of sides = 4");
    }
}
class Triangle extends Shape{
    void numberOfSides(){
        System.out.println("No of sides = 3");
    }
}
class Hexagon extends Shape{
    void numberOfSides(){
        System.out.println("No of sides = 6");
    }
}
    