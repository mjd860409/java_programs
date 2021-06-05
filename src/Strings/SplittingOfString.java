package Strings;

public class SplittingOfString {

    public static void main(String[] args) {
        String s = "Have=a=good=day";
        String[]arr = s.split("=");
        for (int i =0; i<arr.length; i++){
            System.out.println("split is :"+ arr[i]);
        }
    }
}
