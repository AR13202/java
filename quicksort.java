import java.util.*;
//divide conquer combined
public class quicksort {
    static int partition(int arr[],int start,int end){
        int key = arr[end];
        int p = start;
        for(int i=start;i<end;i++){
            if(arr[i]<=key){
                int temp=arr[i];
                arr[i]=arr[p];
                arr[p]=temp;
                p++;
            }
        }
        int temp=arr[end];
        arr[end]=arr[p];
        arr[p]=temp;
        return p;
    }
    static void quick(int arr[],int start,int end){
        if(start<end){
            int part = partition(arr,start,end);
            quick(arr, start, part-1);
            quick(arr, part+1, end);
        }
    }
    public static void main(String []args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        quick(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        s.close();
    }
}
