package WaysOfReversingStrings;

public class ReverseAnEntireSentence {

    public static void main(String[] args) {

        String s = "Have a good day";
        String arr[] = s.split(" ");

        String rev = "";

        for (int i = arr.length-1; i>=0; i--)
        {
            rev = rev + arr[i] + " ";
        }

        System.out.println("Reverse sentence is::"+rev);
    }
}
