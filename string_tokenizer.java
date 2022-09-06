import java.util.*;
class string_tokenizer{
    public static void main(String args[]){
        token a = new token();
        a.tokenizer();
    }
}
class token{
    public void tokenizer(){
        String s;
        int a,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the line of integers: ");
        s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            a = Integer.parseInt(st.nextToken());
            System.out.println(a);
            sum = sum + a;
        }
        System.out.println("Sum is : "+sum);
    }
}