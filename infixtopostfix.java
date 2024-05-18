import java.util.*;
public class infixtopostfix {
    static int priority(char a){
        if(a=='+'||a=='-'){
            return 1;
        }else if(a=='*'||a=='/'||a=='%'){
            return 2;
        }else if(a=='^'){
            return 3;
        }
        return 0;
    }
    static void printstack(Stack<Char> s){
        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
        System.out.println();
    }
    static String convert(String a){
        String w="";
        Stack<Character> s = new Stack<>();
        for(int i=0;i<a.length();i++){
            char b = a.charAt(i);
            if((b>='a' && b<='z')|| (b>='A' && b<='Z')){
                w=w+b;
            }else if(b=='('){
                s.push(b);
            }else if(b==')'){
                while(s.peek()!='('){
                    w=w+s.peek();
                    s.pop();
                }
                s.pop();
            }else{
                while(!s.empty() && priority(b)<=priority(s.peek())){
                    w=w+s.peek();
                    s.pop();
                }
                s.push(b);
            }   
        }
        while(!s.isEmpty()){
            w=w+s.peek();
            s.pop();
        }
        return w;
    }
    public static void main(String[] args){
        String a = "A+B*C+D";
        System.out.println(convert(a));
    }
}
