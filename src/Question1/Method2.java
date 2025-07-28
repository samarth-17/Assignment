package Question1;

public class Method2 {
    public static String reverseMethod2 (String s) {
        String rev_s="";
        char c;
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            rev_s= c+rev_s;
        }
        return rev_s;
    }
}
