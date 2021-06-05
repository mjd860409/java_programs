package Arrays;

public class MissingNumberInArray {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,6};
        int sum = 0;
        for (int i = 0; i< arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("sum is ---->" + sum);

        int sum1 = 0;
        for (int j = 1; j<=6; j++){
            sum1 = sum1+j;

        }

        System.out.println("Missing number is :::" + (sum1-sum));

    }

}
