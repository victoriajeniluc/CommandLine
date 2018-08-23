/**
 * create an example to run on the command line
 *
 * @author Udayan Khattry
 */

public class CommandLine1 {
    public static void main(String[] args) {

        // Test1: finding out why we have String[] args all the time in the main ....
        // System.out.println(args);
           /* OUTPUT:
            Ljava.lang.String;@2437c6dc
            John
            Joe
            Lucy */
            // which is true because we are passing the data type of string

        // Test2: check the length size of String
        // System.out.println(args.length);
            // OUTPUT:
            /*[Ljava.lang.String;@2437c6dc
            0
            John
            Joe
            Lucy*/
            // which is fine to have a zero length of an object.

        // Test 3: How to pass arguments through the command line:
            // java CommandLine1 Red Green
        //System.out.println(args[0]);
            /* OUTPUT:
            [Ljava.lang.String;@2437c6dc
            2 // we sent in two arguments to the class.. thats why it is 2 instead of 0 before
            Red // this is printed because of line 30
            John
            Joe
            Lucy
            */

        // String [] arr = new String[]{"John", "Joe", "Lucy"};
          /* for(String val : arr) {
            System.out.println(val);
           }*/

        // Test 4: how to iterate through the arguments passed through the command line
        for(String val : args) {
            System.out.println(val);
        }
            /*LINE IN TERMINAL:
            java CommandLine1 Viet Vikky Jessica Kezia

            OUTPUT:
            Viet
            Vikky
            Jessica
            Kezia
            */

    }
}
