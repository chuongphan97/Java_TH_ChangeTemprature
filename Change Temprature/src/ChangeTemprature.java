import java.util.Scanner;

public class ChangeTemprature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter Fahrenheit: ");
                    double fah = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius: "+toC(fah));
                    break;
                case 2:
                    System.out.print("Enter Celsius: ");
                    double cel = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit: "+ toF(cel));
                    break;
                case 0:
                    System.exit(0);
            }
        } while ((choice != 0));
    }

    public static double toC(double fah){

        return (5.0 / 9) * (fah - 32);
    }
    public static double toF(double cel){
        return (9.0 / 5) * cel + 32;
    }
}
