class palindrome{
    public static void main(String args[]){
        String s ="";
        for(int i = 0;i<args.length;i++){
            s = s+args[i];
        }
        boolean b = check(s);
        if(b==true)
            System.out.println(s+" is palindrome");             
        else
            System.out.println(s+" is not a palindrome");
    }
    static boolean check(String s){
        int i=0;        
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;                            
            i++;j--;
        }
        return true;
    }
}