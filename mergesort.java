import java.util.*;
public class mergesort {
    static void sortmerge(int arr[],int start,int mid,int end){
        int left = mid-start+1;
        int right=end-mid;
        int leftarray[] = new int[mid-start+1];
        int rightarray[] = new int[end-mid];
        for(int i=0;i<left;i++){
            leftarray[i]=arr[start+i];
        }
        for(int i=0;i<right;i++){
            rightarray[i]=arr[mid+1+i];
        }
        int i=0,j=0,k=start;
        while (i<left && j<right) {
            if(leftarray[i]<rightarray[j]){
                arr[k]=leftarray[i];
                i++;
            }else{
                arr[k]=rightarray[j];
                j++;
            }
            k++;
        }
        while (i<left) {
            arr[k]=leftarray[i];
            i++;
            k++;
        }
        while (j<right) {
            arr[k]=rightarray[j];
            j++;
            k++;
        }
    }
    static void merge(int arr[],int start,int end){
        if(start<end){
            int mid = (start+end)/2;
            merge(arr,start,mid);
            merge(arr,mid+1,end);
            sortmerge(arr,start,mid,end);
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
        merge(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        s.close();
    }
}
