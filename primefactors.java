import java.util.*;
public class primefactors {
    static boolean prime(int n){
        boolean a = true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                a=false;
                break;
            }
        }
        return a;
    }
    public static void main(String []args) {
        int n;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        for(int i=2;i<=n;i++){
            if(n%i==0 && prime(i)){
                System.out.println(i);
                n=n/i;
                i=1;
            }
        }
        s.close();
    }
}
