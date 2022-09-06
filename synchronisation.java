class synchronisation{
    public static void main(String args[]){
        multiple obj = new multiple();
        thread1 t1 = new thread1(obj);
        thread2 t2 = new thread2(obj);
        t1.start();
        t2.start();
    }
}
class multiple{
    synchronized void printMultiple(int n){
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    } 
}
class thread1 extends Thread{
    multiple t;
    thread1(multiple t){
        this.t = t;
    }
    public void run(){
        t.printMultiple(5);
    }
}
class thread2 extends Thread{
    multiple t;
    thread2(multiple t){
        this.t = t;
    }
    public void run(){
        t.printMultiple(3);
    }
}
