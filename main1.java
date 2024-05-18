import java.util.Iterator;
import java.util.*;
public class main1{
    public static void main(String[] args) {
        // ArrayList<String> cars = new ArrayList<String>();
        // cars.add("Volvo");
        // cars.add("BMW");
        // cars.add("Ford");
        // cars.add("Mazda");
        // System.out.println(cars);
        // Collections.sort(cars);
        // Iterator itr = cars.iterator();
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }
        // System.out.println(cars.size());
        // cars.remove(1);
        PriorityQueue <Integer> st = new PriorityQueue<>();
        st.add(6);
        st.add(3);
        st.add(2);
        st.add(5);
        st.add(4);
        st.add(1);
        st.add(7);
        System.out.println(st);
        System.out.println(st.element());
        System.out.println(st.peek());
        Iterator<Integer> it = st.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        st.remove();
        System.out.println(st);
    }
}