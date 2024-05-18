import java.util.*;

// primitive Data Types: byte, short, char(2bytes), boolean(1), int(4),long(8),float(4),double(8)
// Non - primitive Data Types(can be customised): String, Array, Class, Object, Interface
public class Java{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter valur of a: ");
        int a;
        a = s.nextInt();
        System.out.print("enter valur of b: ");
        int b;
        b = s.nextInt();
        //pattern && for loop
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        //coditional Statments
        //if else if else
        if(a>10){
            System.out.println("a >10");
        }else if(a>=5 && a<=10){
            System.out.print("a is b/w 5 and 10 \n");
        }else{
            System.out.println("a less than 5");
        }
        //switch
        switch(b){
            case 1: System.out.print("b is 1");
            break;
            case 2: System.out.println("b is 2");
            break;
            default: System.out.print(b + "invalid number\n");
        }
        int d = 300,i=0;
        System.out.print("prime numbers : ");
        //while loop
        while(i<=d){
            boolean f = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    f=false;
                    break;
                }
            }
            if(f){
                System.out.print(i+" ");
            }
            i++;
        }
        System.out.println();
        i=0;
        //do while if codn is true/false code will atleast run for 1 time
        do{
            System.out.print(i+" ");
            i++;
        }while(i<11);
        System.out.println();
        s.close();
    }
}