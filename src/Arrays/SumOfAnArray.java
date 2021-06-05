package Arrays;

public class SumOfAnArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 6, 7};
        int sum = 0;

        for (int i = 0; i<=arr.length-1; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println("Sum of Array is::"+sum);

    }
}
