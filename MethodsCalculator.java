import java.util.Scanner;

public class MethodsCalculator {

    // Method to calculate the sum of two numbers
    public static int calculateSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    // Method to calculate the average of two numbers
    public static double calculateAverage(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber) / 2.0;
    }

    public static void main(String[] args) {

        // Create Scanner object to receive user input
        Scanner input = new Scanner(System.in);

        // Ask the user for the first number
        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();

        // Ask the user for the second number
        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();

        // Call the sum method
        int sum = calculateSum(firstNumber, secondNumber);
        System.out.println("Sum of the two numbers: " + sum);

        // Call the average method
        double average = calculateAverage(firstNumber, secondNumber);
        System.out.println("Average of the two numbers: " + average);

        // Close Scanner
        input.close();
    }
}