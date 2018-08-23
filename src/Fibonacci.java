/**
 * How to pass an argument from the command line and how to change a string into an integer
 *
 * @author Udayan Khattry
 */
public class Fibonacci {
    public static void main(String[] args) {

        // Error handling for this program... when no arguments are passed or the arguments are greater than 1
        if (args.length != 1) {
            System.out.println("Please provide one command-line argument for the number of elements in the fibonacci series");
            return;
        }
        // How to convert the string to a number
        // NOTE: It will throw an error if you try to convert a string into a number that is not a number like 'abc'
        // NOTE: It will also throw an error if the user doesn't put in any arguments in the command line like this: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
        int stringToNumber = Integer.parseInt(args[0]);

        int count = stringToNumber;

        int [] fib = new int[count];
        fib[0] = 0;
        fib[1] = 1;

        for(int i = 2; i < count; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        for(int val : fib) {
            System.out.print(val + " ");
        }
    }
}
