/**
 * create an example to run on the command line
 *
 * @author Udayan Khattry
 */

public class CommandLine1 {
    public static void main(String[] args) {
        // Test1: finding out why we have String[] args all the time in the main ....
        System.out.println(args);
        // OUTPUT:
        // [Ljava.lang.String;@2437c6dc
        //John
        //Joe
        //Lucy
            // which is true because we are passing the data type of string

        // Test2: check the length size of String
        System.out.println(args.length);
        // OUTPUT:
        /*[Ljava.lang.String;@2437c6dc
        0
        John
        Joe
        Lucy*/
            // which is fine to have a zero length of an object.

        String [] arr = new String[]{"John", "Joe", "Lucy"};

        for(String val : arr) {
            System.out.println(val);
        }
    }
}
