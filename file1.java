import java.io.*;
class file1{
    public static void main(){
        file f = new file();
        f.operation();
    }
}
class file{
    void operation(){
        int i;
        try{
           FileReader fr = new FileReader("file1.txt");
           FileWriter fw = new FileWriter("file2.txt");
           while((i=fr.read())!=-1){
                fw.write(i);
           }
           fr.close();
           fw.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}