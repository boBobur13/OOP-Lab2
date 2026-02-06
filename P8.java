public class PopulationGrowth {
     static void main(String[] args) {
        double population = 100000;
        int  year = 0;
        while (population < 200000) {
            year++;
            population = population * 1.05;
            System.out.printf("Year %d : %.2f\n", year, population);
        }
        System.out.println("It will take " + year + " years to double.");
    }
}
