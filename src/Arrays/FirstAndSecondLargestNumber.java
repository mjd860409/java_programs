package Arrays;

import java.util.Arrays;

public class FirstAndSecondLargestNumber {

    public static void main(String[] args) {
        int arr[] = {22, 34, 56, 87, 67};
        Arrays.sort(arr);
        System.out.println("First largest number is:::"+ arr[arr.length-1]);
        System.out.println("Second largest number is::"+ arr[arr.length-2]);
    }

}
