import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter  your age : ");
        int age = input.nextInt();
        int price;
        if (age >= 0 && age <= 12) {
            price = 7;
        } else if (age >= 13 && age <= 17) {
            price = 10;
        } else if (age >= 18 && age <= 64) {
            price = 15;
        }
        else {
                price = 10;
        }
        System.out.println("Ticket price:$" +price);
            }

}

