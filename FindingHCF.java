
    import java.util.Scanner;  // Import Scanner class for taking user input

public class FindingHCF {

    // Recursive method to find HCF (Highest Common Factor) using Euclid's Algorithm
    public static int HCF(int a, int b) {
        a = Math.abs(a);  // Convert first number to positive (handles negative inputs)
        b = Math.abs(b);  // Convert second number to positive
        
        // Base case: if second number becomes 0, return the first number as HCF
        if (b == 0) {
            return a;
        } 
        else {
            // Recursive call: HCF(a, b) = HCF(b, a % b)
            return HCF(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object for input
        
        // Take two numbers from user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        // Check if both numbers are zero — HCF not defined in this case
        if (num1 == 0 && num2 == 0) {
            System.out.println("HCF is not defined for both numbers being zero.");
        } 
        else {
            // Call the recursive method to find HCF
            int hcf = HCF(num1, num2);
            
            // Display the result
            System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
        }
        
        sc.close();  // Close Scanner to prevent resource leak
    }
}
