/*
 * Array: data stored in contiguous memory, fixed size
 * to avoid we use arraylist
 * ArrayList: Size variable, non-contiguous memory
 * Arraylist: we can only store objects
 * Array: stores primitve and objects
 * Operations in ArrayList:
 * Add, Get, Modify, Delete/Remove, Iterator
 */
import java.util.*;
public class arraylistjava {
    public static void main(String args[]){
        //classes in java: Integer, String, Boolean
        ArrayList<Integer> list= new ArrayList<Integer>();
        //ArrayList<String> list1= new ArrayList<String>();
        //ArrayList<Boolean> list2= new ArrayList<Boolean>();
        //add elements
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);
        //get elements
        System.out.println(list.get(2));
        list.add(1,1);
        System.out.println(list);
        //set element
        list.set(0, 6);
        System.out.println(list);
        //delete element
        list.remove(3);
        System.out.println(list);
        int size = list.size();
        System.out.println(size);
        //loops
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
