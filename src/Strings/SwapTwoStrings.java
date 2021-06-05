package Strings;

public class SwapTwoStrings {

    public static void main(String[] args) {

        String a = "Hello";
        String b = "World";

        // append a and b and store it in a

        a = a+b; //HelloWorld

        // Store initial String a in b. a has the full string

        b = a.substring(0, a.length()-b.length()); //substring means exactly from where we want to capture it.

        // Store initial string b in a

        a = a.substring(b.length());

        System.out.println(a);
        System.out.println(b);

    }
}
