import java.util.*;
//s1.compareto(s2) -=> s1==s2;
//string are object in java
//substring in java : s.substring(begin_index, end_index);
//end_index not included

public class string{
    public static void main(String []args){
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        int x = s.length();
        int mid=x/2;
        mid--;
        String q = "";
        while(mid>=0){
            q=q+s.charAt(mid);
            mid--;
        }
        mid=x/2;
        x--;
        while(x>=mid){
            q=q+s.charAt(x);
            x--;
        }
        System.out.println(q);
        sc.close();
    }
}