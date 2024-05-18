public class stringbuilder {
    public static void main(String args[]){
        String str = "h";
        // stack: h
        // heap: "h" somewhere in heap
        str = str+"e";
        // stack: he
        // heap: "he" somewhere new in heap
        str = str+"l";
        // stack: hel
        // heap: "hel" somewhere new in heap
        str = str+"l";
        // stack: hell
        // heap: "hell" somewhere new in heap
        str = str+"o";
        // stack: hello
        // heap: "hello" somewhere new in heap

        // for larger string length this can take time 
        // so that is why we use stringbuilder
        // what stringbuilder do
        // do changes in memory at same positon only

        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        //replace
        sb.setCharAt(0, 'P');
        System.out.println(sb);
        //insert
        sb.insert(0,'S');
        System.out.println(sb);
        sb.insert(2,'n');
        System.out.println(sb);
        //delete
        sb.delete(2,4);
        System.out.println(sb);
        //add at last
        sb.append("f");
        sb.append("e");
        sb.append("h");
        sb.append("q");
        sb.append("m");// for string str = str+"d";
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
