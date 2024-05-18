import java.util.Scanner;

public class stack {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int x){
            this.data = x;
            this.next = null;
        }
    }
    public static Node push(stack st,int a){
        Node temp = new Node(a);
        if(st.head==null){
            st.head = temp;
        }else{
            temp.next=st.head;
            st.head = temp;
        }
        return st.head;
    }
    public static int top(stack st){
        return st.head.data;
    }
    public static void pop(stack st){
        st.head = st.head.next;
    }
    public static void printstack(stack st){
        Node temp = st.head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print("\n");
    }
    public static int stack_size(stack st){
        int c=0;
        Node temp = st.head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }

    public static void main(String args[]){
        stack st = new stack();
        Scanner s = new Scanner(System.in);
        System.out.print("enter size: ");
        int n;
        n = s.nextInt();
        System.out.print("enter inputs: ");
        while(n>0){
            int a;
            a = s.nextInt();
            st.head = push(st,a);
            n--;
        }
        System.out.print("print stack: ");
        printstack(st);
        System.out.print("top: "+top(st)+"\n");
        System.out.print("pop element\n");
        pop(st);
        System.out.print("size: "+stack_size(st)+"\n");
        System.out.print("print stack: ");
        printstack(st);
        s.close();
    }
}
