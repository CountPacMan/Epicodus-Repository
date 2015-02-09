/**
 *
 * @author Daniel Toader
 */
import java.util.*;

public class PingPong {
    public static void main(String[] args) {
        printIntro();
        int lastNumber = getNumber();
        printNumbers(lastNumber);
    }
    
    public static void printIntro() {
        System.out.println("This program will prompt you to enter a number, "
                + "then the page displays every number up to that number. ");
        System.out.println("But, for multiples of three, the page prints "
                + "\"ping\" instead of the number, and for multiples of ");
        System.out.println("five, the page prints \"pong\". For numbers "
                + "that are multiples of three and five, the page prints ");
        System.out.println("\"ping-pong\".");
    }
   
    public static int getNumber() {
        Scanner console = new Scanner(System.in);
        int lastNumber = -1;        
        while (lastNumber < 1) {
            System.out.print("Enter an integer greater than zero: ");
            if (!console.hasNextInt()) {
                System.out.println("you must enter an integer");
                console.next(); // dump the input
            } else {
                lastNumber = console.nextInt();
            }
        }
        return lastNumber;
    }
    
    public static void printNumbers(int lastNumber) {
        for (int i = 1; i <= lastNumber; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("ping-pong");
            } else if (i % 3 == 0) {
                System.out.println("ping");
            } else if (i % 5 == 0) {
                System.out.println("pong");
            } else {
                System.out.println(i);
            }
        }
    }
}
