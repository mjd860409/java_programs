package Exceptions;

public class FirstTest {

    public static void main(String[] args) {

        int i, j, k;

        int a[] = new int[5];

        i = 1;
        j = 0;
        k = 0;

        try {
            k=i/j;
            for (int c = 0; c<=5; c++){
               a[c] = c+1;
            }
           for (int value : a)
           {
               System.out.println(value);
           }

        }

        catch (ArithmeticException e){
            System.out.println("Can't divide by zero"+e);
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Maximum array has exceeded");
        }

        System.out.println(k);

    }



}
