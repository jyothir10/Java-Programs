import java.util.*;
class quickSort{
    Scanner sc = new Scanner(System.in);
    String a[] = new String[10];
    void quick(){
        int n;
        n = input();
        quickSort(0,n-1);
        display(n);
    }
    int input(){
        int n,i;
        System.out.println("Enter the no of words: ");
        n = sc.nextInt();
        System.out.println("Enter the words: ");
        for(i=0;i<=n;i++){
            a[i] = sc.nextLine();
        }
        return n;
    }
    void quickSort(int p,int r){
        int q;
        if(p<r){
            q = partition(p,r);
            quickSort(p,q-1);
            quickSort(q+1,r);
        }
    }
    int partition(int p,int r){
        int pivot,i,j;
        String temp;
        pivot = p;i=p;j=r;
        while(i<j){
            while((a[i].compareTo(a[pivot])<=0) &&i<r){
                i++;
            }
            while(a[j].compareTo(a[pivot])>0){
                j--;
            }
            if(i<j){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        temp = a[pivot];
        a[pivot] = a[j];
        a[j] = temp;
        return j;
    }
    void display(int n){
        System.out.println("The sorted array is: ");
        for(int i=0;i<=n;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(){
        quickSort q = new quickSort();
        q.quick();
    }
}