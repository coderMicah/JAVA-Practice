/*Suppose gpa is a variable containing the grade point average of a student.
Suppose the goal of a program is to let a student know if he/she made the Dean's list 
(the gpa must be 3.5 or above).Write an if... else... statement that prints out the appropriate message
(either "Congratulations—you made the Dean's List" or "Sorry you didn't make the Dean's List"). */

package QUESTIONS;

import java.util.Scanner;

public class Demo1 {
    static final double MINIMUM_GPA = 3.5;

    public static void main(String args[]) {
        double gpa;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your gpa:");
        gpa = sc.nextDouble();

        if (gpa >= MINIMUM_GPA) {
            System.out.println("Congratulations you made the Dean's List");
        } else {
            System.out.println("Sorry you didn't make the Dean's List");
        }

    }
}
