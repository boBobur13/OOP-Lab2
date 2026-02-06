import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double distance = 570;
        double fuelPer100 = 8.5;
        double pricePerLiter = 12500;
        double fuelNeeded = (distance / 100) * fuelPer100;;
        double TotalCost = (fuelNeeded * pricePerLiter);
        System.out.printf("Fuel Needed:%.2f Liters\n", fuelNeeded);
        System.out.printf(" Total cost: %.3f UZS\n ", TotalCost);
    }
}
