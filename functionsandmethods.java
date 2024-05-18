/*
 * function syntax:
 * returntype name(args...){
 *  //operation
 *  return
 * }
 * returntype: void -- no return;
 * pubic static: before returntype
 * functions are placed as stack in memory with main at bottom
 *  
 * 
 */
public class functionsandmethods {
    public static int numsum(int a,int b){
        return a+b;
    }
    public static void main(String args[]){
        System.out.println(numsum(5,8));
    }
}
