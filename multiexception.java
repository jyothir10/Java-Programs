class multiexception{
    public static void main(String args[]){
        C obj = new C();
        obj.example();
    }
}
class C{
    int a,b,s,arr[] = {1};
    void example(){
        try{
            a = 4;b = 0;
            try{
                arr[2] = 5;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array index out of boundary "+e);
            }
            s = a/b;
        }
        catch(ArithmeticException e){
            System.out.println("You shouldn't divide a number by zero "+e); 
        }
    }
}