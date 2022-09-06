import java.util.*;
class doubly_LL{
    Node head,current = null;
    static Scanner sc = new Scanner(System.in);    
    void createNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            head.previous = null;
            head.next = null;
        }
        else{
            current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = newNode;
            newNode.next = null;
            newNode.previous = current;
        }
    }   
    void delete(){
        int a;
        System.out.println("Enter the data to be deleted: ");
        a = sc.nextInt();
        current = head;
        if(head == null){
            System.out.println("List is empty! No deletion");
            return;
        }
        else{
            while(current.data != a && current!=null){
                current = current.next;
            }
            if(current == null){
                System.out.println("Node with data doesn't exixts! deletion not possible");
                return;
            }
            else if(current == head)
                head = null;
            else if(current.next == null)
                current.previous.next = null;
            else
                current.previous.next = current.next;                       
        }    
    }
    void display(){
        current = head;
        if(head == null){
            System.out.println("List is empty!");
            return;
        }
        else{
            System.out.println("the contents of the Doubly LL are: ");
            while(current!=null){
                System.out.println(current.data+"");
                current = current.next;
            }
        }       
    }
    public static void main(){
        int a,ch = 1;
        doubly_LL list = new doubly_LL();
        while(ch==1){
            System.out.println("Enter the data of the node: ");
            a = sc.nextInt();       
            list.createNode(a);
            System.out.println("Do you want to add more nodes 1-yes ,0 -no: ");
            ch = sc.nextInt();  
        }
        list.delete();
        list.display();
    }
}

class Node{
    int data;
    Node next;
    Node previous;
    
    public Node(int data){
        this.data = data;
    }
}
