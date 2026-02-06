import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter kg : ");
        double kg = input.nextDouble();
        double price;
        if (kg <=2 ) {
            price = 5;
        } else if (kg <=10 ) {
            price = 10;
        } else {
            price = 10+ 2 * ( kg-10 ) ;
        }
        System.out.printf("Shipping Cost: $%.2f\n", price);
    }

}
