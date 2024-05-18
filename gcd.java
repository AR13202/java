import java.util.*;
public class gcd {
    static int gcdnum(int a,int b){
        int m;
        if(a>b){
            m=b;
        }else{
            m=a;
        }
        while(m>0){
            if((a%m==0) && (b%m==0)){
                break;
            }
            m--;
        }
        return m;
    }
    public static void main(String []args) {
        int x,y,z;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y = s.nextInt();
        z = s.nextInt();
        int a = gcdnum(x,gcdnum(y, z));
        System.out.println(a);
        s.close();
    }
}
