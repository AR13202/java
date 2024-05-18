import java.util.*;

public class Bt {
    Node root;
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int x){
            this.data=x;
            this.left=null;
            this.right=null;
        }
    }
    public static Node maketree(Bt b){
        System.out.print("enter root: ");
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        Node tmp = new Node(n);
        b.root=tmp;
        Queue<Node> q = new LinkedList<Node>();
        q.add(b.root);
        while(q.size()>0){
            Node front = q.peek();
            int leftdata;
            int rightdata;
            System.out.print("enter child of " + front.data +": ");
            leftdata = s.nextInt();
            rightdata = s.nextInt();
            if(leftdata!=-1){
                Node leftchild = new Node(leftdata);
                front.left=leftchild;
                q.add(leftchild);
            }
            if(rightdata!=-1){
                Node rightchild = new Node(rightdata);
                front.right=rightchild;
                q.add(rightchild);
            }
            q.remove();
        }
        s.close();
        return b.root;
    }
    public static void printBinarytree(Bt b){
        Node temp = b.root;
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp);
        while(q.size()!=0){
            Node front = q.peek();
            System.out.print(front.data +": ");
            if(front.left!=null){
                System.out.print("L: "+front.left.data +" ");
                q.add(front.left);
            }
            if(front.right!=null){
                System.out.print("R: "+front.right.data +" ");
                q.add(front.right);
            }
            System.out.print("\n");
            q.remove();
        }
    }
    public static int numnodes(Node root){
        if(root==null){
            return 0;
        }
        return 1 + numnodes(root.left) + numnodes(root.right);
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        return 1 + Math.max(height(root.left),height(root.right));
    }
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        Node left = root.left;
        Node right = root.right;
        int leftheight = height(left);
        int rightheight = height(right);
        int a = 1 + leftheight + rightheight;
        int b = diameter(root.left);
        int c = diameter(root.right);
        return Math.max(a, Math.max(b,c));
    }
    public static void main(String args[]){
        Bt b = new Bt();
        b.root = maketree(b);
        System.out.print("\n");
        printBinarytree(b);
        inorder(b.root);
        System.out.print("\n");
        preorder(b.root);
        System.out.print("\n");
        postorder(b.root);
        System.out.print("\n");
        int h = height(b.root);
        System.out.print("height: " + h +"\n");
        System.out.print("diameter: "+diameter(b.root)+"\n");
    }
}
/*
 * 1 2 3 4 5 6 7 8 -1 -1 9 -1 -1 -1 -1 -1 -1 -1 -1 
 * 1: 2 3
 * 2: 4 5
 * 3: 6 7
 * 4: 8 -1
 * 5: -1 9
 * 6: -1 -1
 * 7: -1 -1
 * 8: -1 -1
 * 9: -1 -1
 * minimum spanning tree
 * weighted graph(prims,djkastra,krushkall's algo)
 * infix to postfix
 * avl,red black tree
 * inorder, postorder,preorder to tree
 * mcq
 */
