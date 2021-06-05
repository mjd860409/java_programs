package RandomPrograms;

public class PalindromeNumber {

    public static void main(String[] args) {

        int num = 121;
        int temp = num;
        int rev = 0;

        while (temp!=0)
        {
            rev = rev * 10 + temp % 10;
            temp = temp/10;
        }

        if (num==rev)
        {
            System.out.println("Number is palindrome::"+num);
        }

        else
        {
            System.out.println("Number is not palindrome::"+num);
        }
    }
}
