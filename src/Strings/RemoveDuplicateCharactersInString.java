package Strings;

public class RemoveDuplicateCharactersInString {

    public static void main(String[] args) {

        String str = "aabbcc";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            int idx = str.indexOf(ch,i+1);
            if (idx==-1){
                sb.append(ch);
            }
        }

        System.out.println("After removing duplicate characters:"+sb);
    }
}
