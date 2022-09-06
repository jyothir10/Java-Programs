class garbage{
    public void finalize(){
        System.out.println("object is garbage collected");
    }
    public static void main(String args[]){
        garbage g = new garbage();
        g = null;
        System.gc();
    }
}