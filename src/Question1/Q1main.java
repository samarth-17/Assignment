package Question1;

public class Q1main {
    public static void main(String[] args) {
        String input = "Test";

        System.out.println("Original String: " + input);
        System.out.println("Reversed (Method 1): " + Method1.reverseMethod1(input));
        System.out.println("Reversed (Method 2): " + Method2.reverseMethod2(input));
        System.out.println("Reversed (Method 3): " + Method3.reverseMethod3(input));
    }
}
