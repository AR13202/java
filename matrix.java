import java.util.*;
public class matrix {
    static void diagonal(int a[][]){
        int temp=0;
        System.out.println("Diagonal elements: ");
        for(int i=0;i<5;i++){
            System.out.println(a[i][i]);
            temp=temp+a[i][i];
        }
        System.out.println("Sum: "+temp);
    }
    static void upper_triangle(int a[][]){
        int temp=0;
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                System.out.println(a[i][j]);
                temp=temp+a[i][j];
            }
        }
        System.out.println("Sum: "+temp);
    }
    static void lower_triangle(int a[][]){
        int temp=0;
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                System.out.println(a[j][i]);
                temp=temp+a[j][i];
            }
        }
        System.out.println("Sum: "+temp);
    }
    public static void main(String[] args){
        int a[][] = new int [5][5];
        try (Scanner s = new Scanner(System.in)) {
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    a[i][j] = s.nextInt();
                }
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        diagonal(a);
        upper_triangle(a);
        lower_triangle(a);
    }
}
