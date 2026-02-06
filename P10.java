import java.util.Scanner;
public class CompoundInterestCalculator {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        double balance = 1000;
        double interestRate = 0.05;
        System.out.print("enter number of years: ");
        int years = input.nextInt();
        for (int year = 1; year <= years; year++) {
            balance = balance + (balance * interestRate);
            System.out.printf("Year %d: $%.3f\n", year, balance);
        }
    }
}
