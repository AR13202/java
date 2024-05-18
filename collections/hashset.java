package collections;
import java.util.*;
public class hashset {
    public static void main(String args[]){
        HashSet<Integer> s = new HashSet<Integer>();
        int arr[] = {1,2,2,2,1,3,4,5,2,1,5,6,73,3,4};
        for(int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }
        Iterator<Integer> x = s.iterator();
        while(x.hasNext()){
            System.out.print(x.next()+" ");
        }
        System.out.println();
        System.out.println(s.size());
        s.remove(3);
        System.out.println(s.size());
        x = s.iterator();
        while(x.hasNext()){
            System.out.print(x.next()+" ");
        }
    }
}
