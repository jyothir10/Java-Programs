class Exception{
    public static void main(String args[]){
        methods obj = new methods();
        obj.A();
    }
}
class methods{
    void A(){
        System.out.println("Method A is called");
        try{
            B();
        }
        catch(NumberFormatException e){
            System.out.println("Exception from D is caught at A");
        }
        System.out.println("Method A is returned");
    }
    void B()throws NumberFormatException{
        System.out.println("Method B is called");
        C();
        System.out.println("Method B is returned");
    }
    void C()throws NumberFormatException{
        System.out.println("Method C is called");
        D();
        System.out.println("Method C is returned");
    }
    void D()throws NumberFormatException{
        System.out.println("Method D is called");
        throw new NumberFormatException("Demo");
    }
}