
import java.util.Scanner;

public class PrintNaturalNumbers {

    // Recursive function to print first n natural numbers
    static void printNumbers(int n) {
        if (n == 0)
            return;  // Base case: stop when n reaches 0

        printNumbers(n - 1); // Recursive call
        System.out.print(n + " "); // Print after recursive call for ascending order
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("First " + n + " natural numbers are:");
        printNumbers(n);
        
        sc.close();
    }
}