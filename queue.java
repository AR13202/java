import java.util.Scanner;

public class queue {
    Node head,tail;
    static class Node{
        int data;
        Node next;
        Node(int x){
            this.data=x;
            this.next=null;
        }
    }
    public static Node push(queue q,int x){
        Node temp = new Node(x);
        if(q.head==null){
            q.head = temp;
            q.tail = temp;
        }else{
            q.tail.next=temp;
            q.tail=temp;
        }
        return q.head;
    }
    public static void pop(queue q){
        if(q.head==null){
            return;
        }
        q.head=q.head.next;
    }
    public static void printqueue(queue q){
        Node temp = q.head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print("\n");
    }
    public static int size(queue q){
        int c=0;
        Node temp = q.head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
    public static int front(queue q){
        return q.head.data;
    }
    public static void main(String args[]){
        queue q = new queue();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n;
        n = s.nextInt();
        System.out.print("enter data: ");
        while(n>0){
            int a;
            a = s.nextInt();
            q.head = push(q,a);
            n--;
        }
        System.out.print("print queue: ");
        printqueue(q);
        System.out.print("front: " +front(q)+"\n");
        System.out.print("size: "+size(q)+"\n");
        System.out.print("pop element\n");
        pop(q);
        System.out.print("print queue: ");
        printqueue(q);
        System.out.print("front: " +front(q)+"\n");
        System.out.print("size: "+size(q)+"\n");
        s.close();
    }
}
