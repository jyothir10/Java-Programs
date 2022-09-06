class arithexception{
    public static void main(String args[]){
        A obj = new A();
        obj.divide();
    }
}
class A{
    void divide(){
        try{
         int a = 4,b = 0;
         int c = a/b;
        }
        catch(ArithmeticException e){
            System.out.println("You shouldn't divide a number by zero "+e); 
        }
    }
}