package lab5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /, ^): ");
            String operator = scanner.next();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result;
            boolean validOperation = true;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;

                case "-":
                    result = num1 - num2;
                    break;

                case "*":
                    result = num1 * num2;
                    break;

                case "/":
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        validOperation = false;
                        result = 0;
                    } else {
                        result = num1 / num2;
                    }
                    break;

                case "^":
                    result = Math.pow(num1, num2);
                    break;

                default:
                    System.out.println("Error: Invalid operator.");
                    validOperation = false;
                    result = 0;
            }

            if (validOperation) {
                System.out.println("Result: " + result);
            }

            scanner.close();
        }
    }
