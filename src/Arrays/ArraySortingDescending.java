package Arrays;

public class ArraySortingDescending {

    public static void main(String[] args) {
        int arr[] = {23, 1, 45, 67, 19};
        int temp;

        for (int i = 0; i< arr.length; i++){
            for (int j = i; j< arr.length; j++){
                if (arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int b : arr) {
            System.out.println(b);
        }

    }
}
