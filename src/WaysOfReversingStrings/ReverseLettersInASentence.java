package WaysOfReversingStrings;

public class ReverseLettersInASentence {

    public static void main(String[] args) {
        String s = "Have a good day";
        int len = s.length();
        String rev = "";

        for (int i = len-1; i>=0; i--){
            rev = rev + s.charAt(i);
        }

        System.out.println("The reverse string is::"+rev);
    }
}
