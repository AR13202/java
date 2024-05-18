import java.util.*;
public class Arrays {
    public static void main(String args[]){
        //declaration
        Scanner s = new Scanner(System.in);
        //int [] arr2 = new int[5];
        //int arr[] = {5,6,7};
        //memory: length*(size of datatype)
        //java intially stores a null value at array memory position
        // null means: 0,0.0,"" etc..
        //in c++ garbage value is stored
        //int n = arr.length;
        //2d arrays
        int mat[][] = new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                mat[i][j] = s.nextInt();
            }
        }
        // memory: rows*col*(size of datatype)
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        s.close();
    }
}
