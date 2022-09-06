class numberexception{
      public static void main(String args[]){
         D obj = new D();
         obj.parse();
      }
}
class D{
    void parse(){
        try{
            String s = "Hello";
            int a = Integer.parseInt(s);
        }
        catch(NumberFormatException e){
            System.out.println("Number format exception "+e);
        }
    }
}