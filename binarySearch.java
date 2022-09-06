import java.util.*;
class binarySearch{
    int n,a,index;
    List al = new ArrayList();
    Scanner sc = new Scanner(System.in);
    public static void main(){
        binarySearch b = new binarySearch();
        b.input();
        b.search();
    }
    public void input(){       
        System.out.println("Enter the no of elements: ");
        n = sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i = 0;i<n;i++){
            a = sc.nextInt();
            al.add(a);
        }
    }
    public void search(){
        System.out.println("Enter the element to be searched: ");
        a = sc.nextInt();
        index = Collections.binarySearch(al,a);        
        if(index>=0)
            System.out.println("Element present at index: "+index);
        else
            System.out.println("Element is not present");
    }
}
