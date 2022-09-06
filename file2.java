import java.io.*;
class file2{
    public static void main(){
        files f = new files();
        f.operation();
    }
}
class files{
    void operation(){
        int ch;
        try{
            FileInputStream fis = new FileInputStream("file3.txt");
            FileOutputStream fos = new FileOutputStream("file4.txt");
            while((ch=fis.read())!=-1){
                fos.write(ch);
            }
            fis.close();
            fos.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}