import java.util.*;
public class strings {
    public static void main(String[] args){
        String s;
        try (Scanner sc = new Scanner(System.in)) {
            s = sc.next();
        }
        System.out.println(s);
        String a = new String("dfdgf");
        char c[]={'a','d','t','e'};
        String c1 = new String(c);
        System.out.println(a);
        System.out.println(c1);
        System.out.println(s.length());
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
        System.out.println(s.substring(2,4));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(String.join("-",s,a));
        String e = "asdfg h jkl yui h hdfd";
        System.out.println(e.indexOf("yui"));
        System.out.println(e.indexOf("h",10));
    }
}
