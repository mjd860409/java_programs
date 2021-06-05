package Strings;

public class OccurrenceOfString {

    public static void main(String[] args) {
        String s = "PROGRAMMING";
        int count = s.length();
        int revCount = s.replace("M", "").length();
        int totalCount = count-revCount;
        System.out.println(totalCount);
    }
}
