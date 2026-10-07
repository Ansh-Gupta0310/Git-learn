import java.util.Scanner;

public class caladd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char choice;
        double a, b;

        do {
            System.out.println("1. Add Two Numbers");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.next().charAt(0);

            switch (choice) {
                case '1':
                    System.out.print("Enter Two Numbers: ");
                    a = scan.nextDouble();
                    b = scan.nextDouble();
                    System.out.println("Result = " + (a + b));
                    break;
                case '2':
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("INVALID CHOICE !!!");
                    break;
            }

            System.out.println();
            System.out.println("--------------------");
        } while (choice != '2');

        scan.close();
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public int modulus(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot perform modulus by zero");
        }
        return a % b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int add(int a, int b) {
        return a + b;
    }
}