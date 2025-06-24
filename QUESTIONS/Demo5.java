/* Write a program to prepare the monthly charge account statement for a customer of CS CARD International, a credit card
company. The program should take as input the previous balance on the account and the total amount of additional charges
during the month. The program should then compute the interest for the month, the total new balance (the previous balance
plus additional charges plus interest), and the minimum payment due. Assume the interest is 0 if the previous balance was 0
but if the previous balance was greater than 0 the interest is 2% of the total owed (previous balance plus additional charges).
Assume the minimum payment is as follows:
new balance for a new balance less than $50
$50.00 for a new balance between $50 and $300 (inclusive)
20% of the new balance for a new balance over $300
So if the new balance is $38.00 then the person must pay the whole $38.00; if the balance is $128 then the person must pay
$50; if the balance is $350 the minimum payment is $70 (20% of 350).. Print the actual dollar amounts in each place using currency format from the NumberFormat
class */

package QUESTIONS;

import java.text.NumberFormat;
import java.util.Scanner;

public class Demo5 {

    public static void main(String args[]) {
        double previousBalance;
        double additionalCharges;
        double interest = 0;
        double newBalance;
        double minimumPayment;

        Scanner sc = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        System.out.print("Please enter previous Balance: ");
        previousBalance = sc.nextDouble();
        sc.nextLine();

        System.out.print("Please enter additional charges: ");
        additionalCharges = sc.nextDouble();
        // sc.nextLine();

        // compute interest
        if (previousBalance == 0) {
            interest = 0;
        }
        if (previousBalance > 0) {
            interest = 0.2 * (previousBalance + additionalCharges);
        }

        // compute new balance (the previous balance plus additional charges plus
        // interest)
        newBalance = previousBalance + additionalCharges + interest;

        // compute minimum payment due
        if (newBalance < 50) {
            minimumPayment = newBalance;
        } else if (newBalance >= 50 && newBalance <= 300) {
            minimumPayment = 50;
        } else {
            minimumPayment = 0.2 * newBalance;
        }

        System.out.printf("\n", "");
        System.out.println("CS CARD International Statement");
        System.out.println("===============================");
        System.out.printf("\n", "");

        System.out.printf("%-30s %10s%n", "Previous Balance:", nf.format(previousBalance));
        System.out.printf("%-30s %10s%n", "Additional Charges:", nf.format(additionalCharges));
        System.out.printf("%-30s %10s%n", "Interest:", nf.format(interest));
        System.out.printf("%-30s %10s%n", "New Balance:", nf.format(newBalance));
        System.out.printf("%-30s %10s%n", "Minimum Payment:", nf.format(minimumPayment));

    }

}
