package collections;

import java.util.*;

public class hashmap {
    public static void main(String args[]) {
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        int arr[] = {1,2,2,2,1,3,4,5,2,1,5,6,73,3,4};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(m.containsKey(arr[i])){
                m.put(arr[i],m.get(arr[i])+1);
            }else{
                m.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> x: m.entrySet()){
            System.out.println(x.getKey()+"->"+x.getValue());
        }
        System.out.println(m.size());
        m.remove(3);
        System.out.println(m.size());
        for(Map.Entry<Integer,Integer> x: m.entrySet()){
            System.out.println(x.getKey()+"->"+x.getValue());
        }
    }
}
