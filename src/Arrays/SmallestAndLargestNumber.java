package Arrays;

import java.util.Arrays;


public class SmallestAndLargestNumber {

    public static void main(String[] args) {
        int numbers[] = {-6, 7, 8, -90, 78};
        int largest = numbers[0];
        int smallest = numbers[0];
        for (int i = 1; i<numbers.length; i++)
        {
            if (numbers[i]>largest)
            {
                largest = numbers[i];
            }
            else if (numbers[i]<smallest)
            {
                smallest = numbers[i];
            }
        }

        System.out.println("Largest number is ::" + largest);
        System.out.println("Smallest number is ::" + smallest);
    }
}
