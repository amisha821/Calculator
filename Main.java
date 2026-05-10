import java.util.Scanner;

class Calculator {
    protected double a;
    protected double b;

    public void setValues(double a, double b) {
        this.a = a;
        this.b = b;
    }
}

class Addition extends Calculator {
    public double calculate() {
        return a + b;
    }
}

class Subtraction extends Calculator {
    public double calculate() {
        return a - b;
    }
}

class Multiplication extends Calculator {
    public double calculate() {
        return a * b;
    }
}

class Division extends Calculator {
    public double calculate() {
        if (b == 0) {
            System.out.println("Error: Division by zero not allowed!");
            return Double.NaN;
        }
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            double result;

            switch (choice) {

                case 1:
                    Addition add = new Addition();
                    add.setValues(a, b);
                    result = add.calculate();
                    break;

                case 2:
                    Subtraction sub = new Subtraction();
                    sub.setValues(a, b);
                    result = sub.calculate();
                    break;

                case 3:
                    Multiplication mul = new Multiplication();
                    mul.setValues(a, b);
                    result = mul.calculate();
                    break;

                case 4:
                    Division div = new Division();
                    div.setValues(a, b);
                    result = div.calculate();
                    break;

                default:
                    System.out.println("Invalid choice!");
                    continue;
            }

            System.out.println("Result = " + result);
        }

        sc.close();
    }
}