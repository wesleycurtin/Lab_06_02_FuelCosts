import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double numGallons = 0;
        double efficiency = 0;
        double gasPrice = 0;
        String trash = "";

        System.out.print("How many gallons of gas are in the tank: ");

        if(in.hasNextDouble()) {
            numGallons = in.nextDouble();
            in.nextLine();
        }
        else {
            trash = in.nextLine();
            System.out.println("\n" + trash + " is not a valid number!");
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);
        }

        System.out.print("What is the fuel efficiency in miles per gallon: ");

        if(in.hasNextDouble()) {
            efficiency = in.nextDouble();
            in.nextLine();
        }
        else {
            trash = in.nextLine();
            System.out.println("\n" + trash + " is not a valid number!");
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);
        }

        System.out.print("What is the price of gas per gallon: ");

        if(in.hasNextDouble()) {
            gasPrice = in.nextDouble();
            in.nextLine();
        }
        else {
            trash = in.nextLine();
            System.out.println("\n" + trash + " is not a valid number!");
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);
        }

        System.out.println("The cost to travel 100 miles is " + (100 / efficiency) * gasPrice + " dollars!");
        System.out.println("The car will be able to travel " + (numGallons * efficiency) + " miles!");











    }
}