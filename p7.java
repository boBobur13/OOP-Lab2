import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int correctPin = 9876;
        int attempts = 0;
        while (attempts < 3) {
            System.out.print("Enter Pin: ");
            int pin = input.nextInt();
            if (pin == correctPin) {
                System.out.println(" Access Granted");
                break;
            } else {
                System.out.println("Try again");
            }
            attempts++;
        }
        if (attempts == 3) {
            System.out.println(" Account Locked");// Vaqtim yetmay qoldi 
        }
    }
}
