import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Welcome to the Simple Calculator."); // Menu
        System.out.println("Which operation would you like to do? (choose number from 1 to 5)");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exponentiation");

        int operationKot = myObj.nextInt();
        System.out.println("Choose the first number: ");
        double firstNumberKot = myObj.nextDouble();  // Read user input
        System.out.println("Choose the second number: ");
        double secondNumberKot = myObj.nextDouble();  // Read user input

        if (operationKot == 1)
        {
            System.out.println(firstNumberKot + secondNumberKot);
        }
        if (operationKot == 2)
        {
            System.out.println(firstNumberKot - secondNumberKot);
        }
        if (operationKot == 3)
        {
            System.out.println(firstNumberKot * secondNumberKot);
        }
        if (operationKot == 4)
        {
            System.out.format("%.2f", firstNumberKot / secondNumberKot);
        }
        if (operationKot == 5)
        {
            System.out.println(Math.pow(firstNumberKot, secondNumberKot));
        }
    }
}
