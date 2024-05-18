import java.util.*;
public class smithnumber {
    static int sumnum(int n){
        int a = 0;
        while(n>0){
            a =a+n%10;
            n=n/10;
        }
        return a;
    }
    static int factorsum(int n){
        int a =0;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                a =a + sumnum(i);
                n=n/i;
                i=1;
            }
        }
        return a;
    }
    public static void main(String []args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int num_sum = sumnum(n);
        int fact_sum = factorsum(n);
        System.out.println(num_sum + " " + fact_sum);
        s.close();
    }
}
