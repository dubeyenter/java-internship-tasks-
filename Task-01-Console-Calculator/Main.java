import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1, num2, operator;
        double result = 0;
        Scanner sc = new Scanner(System.in);

        do {
            displayMenu();
            operator = sc.nextInt();

            if (operator == 5) {
                System.out.println("Exiting Calculator. Goodbye!");
                break;
            }

            if (operator < 1 || operator > 5) {
                System.out.println("❌ Invalid option. Please choose between 1 to 5.");
                continue;
            }

            System.out.print("Enter first number: ");
            num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            num2 = sc.nextInt();

            Calculator c = new Calculator(num1, num2);

            switch (operator) {
                case 1:
                    result = c.addition();
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = c.subtraction();
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = c.multiplication();
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    try {
                        result = c.division();
                        System.out.println("Result: " + result);
                    } catch (ArithmeticException e) {
                        System.out.println(" Error: " + e.getMessage());
                    }
                    break;
            }

        } while (operator != 5);

        sc.close();
    }

    public static void displayMenu() {
        System.out.println("\n--- Calculator Menu ---");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }
}
