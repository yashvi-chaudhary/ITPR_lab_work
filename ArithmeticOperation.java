import java.util.Scanner; // Importing Scanner class for user input

//----- Defining a class for Arithmetic Operations ----//
class ArithmeticOperations
{
    int num1, num2; // Variables to store numbers

    // Constructor to initialize numbers
    public ArithmeticOperations(int n1, int n2)
    {
        num1 = n1;
        num2 = n2;
    }

    // Method to calculate sum
    public int addition()
    {
        return num1 + num2;
    }

    // Method to calculate difference
    public int difference()
    {
        return num1 - num2;
    }

    // Method to calculate product
    public int product()
    {
        return num1 * num2;
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Creating object of class
        ArithmeticOperations obj = new ArithmeticOperations(a, b);

        // Displaying results
        System.out.println("Addition = " + obj.addition());
        System.out.println("Difference = " + obj.difference());
        System.out.println("Product = " + obj.product());

        sc.close();
    }
}