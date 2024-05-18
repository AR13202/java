import java.util.*;
public class ques1{
    public static void main(String []args) {
        int n,m,l;
        try (Scanner s = new Scanner(System.in)) {
            n=s.nextInt();
            m=s.nextInt();
            l=s.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
            }
            int arr1[] = new int[n];
            for(int i=0;i<m;i++){
                arr1[i]=s.nextInt();
            }
            int arr2[] = new int[n];
            for(int i=0;i<l;i++){
                arr2[i]=s.nextInt();
            }
            Arrays.sort(arr);
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            int i = 0, j = 0, k = 0;
            while (i < arr.length && j < arr1.length&& k < arr2.length) {
                if (arr[i] == arr1[j] && arr1[j] == arr2[k]) {
                    System.out.print(arr[i] + " ");
                    i++;
                    j++;
                    k++;
                }
                else if (arr[i] < arr1[j])
                    i++;
                else if (arr1[j] < arr2[k])
                    j++;
                else
                    k++;
            }
        }
    }
}