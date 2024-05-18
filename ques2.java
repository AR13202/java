import java.util.*;
public class ques2 {
    static void printFirstRepeating(int arr[]){
        int min = -1;
        HashSet<Integer> set = new HashSet<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (set.contains(arr[i])){
                min = i;
            }
            else {
                set.add(arr[i]);
            }
        }
        if (min != -1){
            System.out.println("The first repeating element is " + arr[min]);
        }
        else{
            System.out.println("There are no repeating elements");
        }
    }
    public static void main(String []args) {
        int n;
        try (Scanner s = new Scanner(System.in)) {
            n=s.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
            }
            printFirstRepeating(arr);
        }
    }
}
