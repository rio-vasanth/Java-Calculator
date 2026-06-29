import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char again;

        do {
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");

            System.out.print("Choose (1-4): ");
            int choice = sc.nextInt();

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            if (choice == 1) {
                System.out.println("Answer = " + (a + b));
            } else if (choice == 2) {
                System.out.println("Answer = " + (a - b));
            } else if (choice == 3) {
                System.out.println("Answer = " + (a * b));
            } else if (choice == 4) {
                if (b != 0) {
                    System.out.println("Answer = " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
            } else {
                System.out.println("Invalid choice.");
            }

            System.out.print("Do another calculation? (y/n): ");
            again = sc.next().charAt(0);

        } while (again == 'y' || again == 'Y');

        System.out.println("Calculator Closed.");
        sc.close();
    }
}