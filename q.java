import java.util.*;
public class q{
    static boolean check(int []word1,int []word2){
        String s="";
        String s1="";
        for(int i=0;i<word1.length;i++){
            s=s+word1[i];
        }
        for(int i=0;i<word2.length;i++){
            s1=s1+word2[i];
        }
        System.out.println(s + "  " + s1);
        return s==s1;
    }
    public static void main(String []args) {
        int n,m;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        m=s.nextInt();
        int arr[]=new int[n];
        int arr2[]=new int[m];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i]=s.nextInt();
        }
        System.out.println(check(arr,arr2));
        s.close();
    }
}