package WaysOfReversingStrings;

public class ReverseEachWordInString {

    public static void main(String[] args) {

        String s = "Have a good day";
        String arr[] = s.split(" ");
        String rev = "";

        for (int i = 0; i< arr.length; i++)
        {
           String words = arr[i];
           String revWord = "";

           for (int j = words.length()-1; j>=0; j--)
           {
              revWord = revWord + words.charAt(j);
           }

           rev = rev + revWord + " ";
        }

        System.out.println(rev);



    }


}
