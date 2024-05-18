package collections;
import java.util.*;
public class vector {
    public static void main(String args[]){
        Vector<Integer> v = new Vector<Integer>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(8);
        v.add(9);
        v.add(3);
        v.add(0);
        v.add(21);
        v.add(43);
        v.add(23);
        v.add(10);
        System.out.println(v);
        System.out.println(v.elementAt(4));
        System.out.println(v.size());
        System.out.println(Collections.max(v));
        Collections.sort(v);
        System.out.println(v);
        v.remove(5);
        System.out.println(v);
        for(int i=0;i<v.size();i++){
            System.out.print(v.elementAt(i)+" ");
        }
        System.out.println();
    }
}
