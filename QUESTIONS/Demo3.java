/* Create a program to determine the raise and new salary for an employee
The input to the program includes the current annual salary for the employee and a number indicating
the performance rating (1=excellent, 2=good, and 3=poor).
An employee with a rating of 1 will receive a 6% raise, an employee with a rating of 2 will receive 
a 4% raise, and one with a rating of 3 will receive a 1.5% raise. */

package QUESTIONS;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        double currentSalary; // current annual salary
        int rating; // performance rating
        double raise = 0; // dollar amount of the raise

        Scanner scan = new Scanner(System.in);

        // Get the current salary and performance rating
        System.out.print("Enter the current salary: ");
        currentSalary = scan.nextDouble();
        System.out.print("Enter the performance rating( where 1=excellent, 2=good, and 3=poor): ");
        rating = scan.nextInt();

        switch (rating) {
            case 1:
                raise = 0.06 * currentSalary;
                break;
            case 2:
                raise = 0.04 * currentSalary;
                break;
            case 3:
                raise = 0.015 * currentSalary;
                break;
            default:
                System.out.println("Please select performance between range of 1-3 ,1 eing excellent");
                return;
        }

        // Print the results
        System.out.printf("%s%.2f%n", "Amount of your raise:", raise);
        System.out.printf("%s%.2f", "Your new salary:", currentSalary + raise);
    }
}
