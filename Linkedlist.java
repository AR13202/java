import java.util.*;
public class Linkedlist {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int x){
            this.data = x;
            this.next = null;
        }
        
    }
    public static Node takeInput(Linkedlist ll){
        Scanner s =new Scanner(System.in);
        int n;
        System.out.print("enter number of inputs: ");
        n = s.nextInt();
        ll.head=null;
        Node tail = ll.head;
        System.out.print("enter values: ");
        while(n>0){
            int a;
            a = s.nextInt();
            Node temp = new Node(a);
            temp.next = null;
            if(ll.head==null){
                ll.head = temp;
                tail = temp;
            }else{
                tail.next= temp;
                tail = temp;
            }
            n--;
        }
        s.close();
        return ll.head; 
    }
    //1->2->3->4->5 pos2->6 = 1->6->2->3->4->5; 
    public static Node insertll(Linkedlist ll,int x,int pos){
        int i=1;
        Node temp=ll.head;
        Node t = new Node(x);
        if(pos==1){
            t.next=temp;
            return t;
        }
        while((i+1)!=pos && temp.next!=null){
            temp=temp.next;
            i++;
        }
        if(temp.next!=null){
            t.next=temp.next;
        }
        temp.next=t;
        return ll.head;
    }
    public static Node deletell(Linkedlist ll,int idx){
        if(idx==0){
            ll.head = ll.head.next;
            return ll.head;
        }
        int i=0;
        Node temp=ll.head;
        while((i+1)!=idx && temp.next!=null){
            temp=temp.next;
            i++;
        }
        if(temp.next!=null){
            temp.next=temp.next.next;
        }
        return ll.head;
    }
    public static Node deletellval(Linkedlist ll,int val){
        Node temp = ll.head;
        if(ll.head.data==val){
            ll.head=ll.head.next;
            temp=ll.head;
        }
        while(temp.next!=null && temp.next.data!=val){
            temp=temp.next;
        }
        if(temp.next!=null && temp.next.data==val){
            temp.next=temp.next.next;
        }
        
        return ll.head;
    }
    public static void printll(Linkedlist ll){
        Node temp = ll.head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]) {
        Scanner s =new Scanner(System.in);
        Linkedlist ll = new Linkedlist();
        ll.head = takeInput(ll);
        ll.head = insertll(ll, 6, 2);
        ll.head = insertll(ll, 7, 1);
        ll.head = insertll(ll, 8, 8);
        ll.head = insertll(ll, 10, 22);
        ll.head = insertll(ll, 9, 9);
        printll(ll);
        ll.head = deletell(ll,9);
        ll.head = deletell(ll,4);
        ll.head = deletell(ll,0);
        printll(ll);
        ll.head = deletellval(ll, 1);
        ll.head = deletellval(ll, 8);
        ll.head = deletellval(ll, 9);
        printll(ll);
        s.close();
    }
}
