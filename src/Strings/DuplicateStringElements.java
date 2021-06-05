package Strings;

public class DuplicateStringElements {

    public static void main(String[] args) {
        String names[] = {"Java", "JavaScript", "Selenium", "Java", "Appium"};

        for (int i = 0; i< names.length; i++){
            for (int j = i+1; j<names.length; j++){
                if (names[i].equals(names[j])){
                    System.out.println("Duplicate element is-------->" + names[i]);
                }

            }



        }
    }
}
