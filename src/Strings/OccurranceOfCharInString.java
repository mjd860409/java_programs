package Strings;

public class OccurranceOfCharInString {

    public static void main(String[] args) {
        String s="Himalaya";
        for(int i=0;i<s.length();i++)
        {
            int count = 0;

            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j)&&i>j)
                { break;

                }
                if(s.charAt(i)==s.charAt(j))
                {
                    count++;
                }
                if(j==s.length()-1)
                {
                    System.out.println(s.charAt(i)+"  "  +"occurs"+" " +count);
                }

            }
        }
    }
}


