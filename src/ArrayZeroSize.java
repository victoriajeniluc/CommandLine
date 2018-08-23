/**
 * Create an example of what happens when we run an array size of 0
 *
 * @author Udayan Khattry
 */
public class ArrayZeroSize {
    public static void main(String[] args) {
        int [] arr = new int[0];
        System.out.println("Array size is: " + arr.length);

        System.out.println(arr[0]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0

    }
}
