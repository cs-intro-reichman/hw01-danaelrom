/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);


        int sum = 0;
        sum = x + y ;
        System.out.println(x + " + " + y + " = " + sum);
    }
}
