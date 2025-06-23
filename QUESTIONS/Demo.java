/* Rewrite each condition below in valid Java syntax (give a boolean expression):
a. x > y > z
b. x and y are both less than 0
c. neither x nor y is less than 0
d. x is equal to y but not equal to z */

package QUESTIONS;

import java.util.Scanner;

class Demo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 3 numbers");
        System.out.print("Please enter the first number: ");
        int x = sc.nextInt();
        System.out.print("Please enter the second number: ");
        int y = sc.nextInt();
        System.out.print("Please enter the third number: ");
        int z = sc.nextInt();

        if (x > y && y > z) {
            System.out.println(z + " " + "is the greatest");
        }
        if (x > 0 && y > 0) {
            System.out.println(x + " " + "and " + y + " " + "are both less than 0");
        }
        if (x < 0 && y < 0) {
            System.out.println("Neither " + x + " " + "nor " + y + " " + "is less than 0");
        }
        if (x == y && x != z) {
            System.out.println(x + " is equal to " + y + "but not equal to " + z);
        }

    }
}
