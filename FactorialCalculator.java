
import java.util.Scanner;  

public class FactorialCalculator {

    // Recursive method to calculate factorial of a number
    // Return type is 'long' to handle large factorial values
    public static long factorial(int n) {
        
        // Base case: if n is 0 or 1, factorial is 1
        if (n == 0 || n == 1) {
            return 1;
        } 
        else {
            // Recursive case: n! = n * (n - 1)!
            // Function calls itself with (n - 1)
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object for user input

        System.out.print("Enter a number for calculating factorial: ");
        int num = sc.nextInt();  // Read number from user

        // Check if the number is negative
        if (num < 0) {
            // Factorial is not defined for negative numbers
            System.out.println("Factorial of a negative number is not possible.");
        } 
        else {
            // Call the recursive factorial method
            long result = factorial(num);
            
            // Display the result
            System.out.println("Factorial of " + num + " is: " + result);
        }

        sc.close();  // Close the Scanner object to prevent resource leak
    }
}