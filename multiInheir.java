class multiInheir{
    public static void main(String args[]){
        inherit obj = new inherit();
        obj.walk();
        obj.run();
    }
}
interface E{
    void walk();
}
interface B{
    void run();
}
class inherit implements E,B{
    public void walk(){
        System.out.println("Walking to E");
    }
    public void run(){
        System.out.println("Running to B");
    }
}