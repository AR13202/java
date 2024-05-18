import java.util.*;
public class q2 {
    public static void main(String []args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        boolean a = true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                a=false;
                break;
            }
        }
        if(a){
            System.out.println("prime");
        }else{
            System.out.println("Not Prime");
        }
        s.close();
    }
}
