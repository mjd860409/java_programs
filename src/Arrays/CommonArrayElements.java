package Arrays;

public class CommonArrayElements {

    public static void main(String[] args) {

        int arr1[] = {3, 4, 5, 6, 1, 8};
        int arr2[] = {3, 7, 9 ,5, 6};

        for (int i = 0; i< arr1.length; i++){
            for (int j = 0; j< arr2.length; j++){
                if (arr1[i]==arr2[j]){
                    System.out.println("Common elements are::"+ arr1[i]);
                }
            }
        }
    }
}
