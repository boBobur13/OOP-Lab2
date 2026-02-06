import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of  cappuccinos : ");
        int cappuccino = input.nextInt();
        System.out.print("Enter number of muffin : ");
        int muffin = input.nextInt();
        double subtotal =cappuccino *4.50+muffin*3.00;
        double tax =subtotal*0.08;
        double grandTotal =subtotal+tax+5.00;
        System.out.printf("grand Total:$%.2f",grandTotal);
    }
}
