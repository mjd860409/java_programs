package Miscellaneous;

public class StarPattern {

    public static void main(String[] args) {
        int n = 12345;
        for (int i = n; i>0; i-- )
        {

            for (int j = 0; j<i; j++)
            {
                System.out.print("x");
            }
            System.out.print("\n");
        }
    }
}
