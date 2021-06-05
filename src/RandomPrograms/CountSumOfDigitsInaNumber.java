package RandomPrograms;

public class CountSumOfDigitsInaNumber {

    public static void main(String[] args) {

        int num = 3456;
        int sum = 0;

        while (num>0)
        {
           sum = sum + num % 10;
           num = num/10;

        }
        System.out.println("Sum of the digits is::"+sum);
    }
}
