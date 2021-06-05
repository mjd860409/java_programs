package Strings;

public class OccurranceOfCharInString1 {

    public static void main(String[] args) {

        String s = "proghskfhshfhkfshramming";
        char []arr = s.toCharArray();
        int len = s.length();
        int count;

        for (int i = 0; i<len-1; i++){
            count = 1;
            for (int j = i+1; j<len; j++){
                if (arr[i]==arr[j]){
                    count++;
                    for (int k = j; k<len-1; k++){
                        arr[k] = arr[k+1];
                    }
                    len--;
                }
            }
            System.out.println(arr[i]+" = "+count);
        }

    }
}
