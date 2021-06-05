package Arrays;

public class ArraySortingAscending {

    public static void main(String[] args) {

        int arr[] = {2, 4, 5, 1, 3, 10};
        int temp;

        for (int i = 0; i< arr.length; i++){
            for (int j = i; j< arr.length; j++){
                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        for (int a:arr) {
            System.out.print(a);

        }

    }

}
