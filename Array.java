import java.util.*;
class Array{
    static void min_ele(int x[]){
        int min=x[0];
        for(int i:x){
            if(i<min){
                min=i;
            }
        }
        System.out.println(min);
    }
    static void max_ele(int x[]){
        int max=x[0];
        for(int i:x){
            if(i>max){
                max=i;
            }
        }
        System.out.println(max);
    }
    static int[] sort_ele(int arr[]){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int a[] = new int[5];
        try (Scanner sc = new Scanner(System.in)) {
            for(int i=0;i<a.length;i++){
                a[i]=sc.nextInt();
            }
        }
        for(int i:a){
            System.out.println(i);
        }
        System.out.println("min_ele: ");
        min_ele(a);
        System.out.println("max_ele: ");
        max_ele(a);
        System.out.println("sort_ele: ");
        a = sort_ele(a);
        for(int i:a){
            System.out.println(i);
        }
    }
}