/* Create a program to determine the raise and new salary for an employee
The input to the program includes the current annual salary for the employee and a string indicating
the performance rating (the three possible ratings are "Excellent", "Good", and "Poor".).
An employee with a rating of Excellent will receive a 6% raise, an employee with a rating of Good
will receive a 4% raise, and one with a rating of Good will receive a 1.5% raise. */

package QUESTIONS;

import java.text.NumberFormat;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        double currentSalary; // current annual salary
        double raise = 0; // dollar amount of the raise
        double newSalary; // new salary for the employee
        String rating; // performance rating

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the current salary: ");
        currentSalary = sc.nextDouble();
        sc.nextLine();

        System.out.println(
                "Please enter your performance(the three possible ratings are Excellent, Good, and Poor.) to calculate raise");
        rating = sc.next();

        // If you use rating == "Excellent" in Java instead of
        // rating.equals("Excellent"),
        // it might not work correctly, even if the string value looks the same
        // == checks object reference equality, not value equality.

        if (rating.equalsIgnoreCase("Excellent")) {
            raise = currentSalary * 0.06;
        } else if (rating.equalsIgnoreCase("Good")) {
            raise = currentSalary * 0.04;
        } else if (rating.equalsIgnoreCase("Poor")) {
            raise = currentSalary * 0.015;
        } else {
            System.out.println("Invalid performance rating entered.");
            return;
        }
        newSalary = currentSalary + raise;
        // Print the results
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println();
        System.out.println("Current Salary: " + money.format(currentSalary));
        System.out.println("Amount of your raise: " + money.format(raise));
        System.out.println("Your new salary: " + money.format(newSalary));
        System.out.println();
    }
}
