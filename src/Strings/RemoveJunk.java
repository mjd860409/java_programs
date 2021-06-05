package Strings;

public class RemoveJunk {

    public static void main(String[] args) {
        String s = "@#@$%%5Manas86^*(&&";
        s = s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
    }
}
