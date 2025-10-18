import java.util.Scanner; //importing Scanner class for user input

//----- Defining a class for Triangle Calculations ----//
class TriangleCalculator
{
    double side1, side2, side3; //declaring sides of triangle
    double area, perimeter;     //declaring variables for results

    //Constructor
    public TriangleCalculator()
    {
        Scanner sc = new Scanner(System.in); //Creating object of Scanner class

        System.out.print("Enter first side of the triangle: ");
        side1 = sc.nextDouble();

        System.out.print("Enter second side of the triangle: ");
        side2 = sc.nextDouble();

        System.out.print("Enter third side of the triangle: ");
        side3 = sc.nextDouble();

        sc.close(); //closing scanner object to avoid resource leak
    }

    //method to calculate perimeter
    private void calculatePerimeter()
    {
        perimeter = side1 + side2 + side3;
    }

    //method to calculate area using Heron's formula
    private void calculateArea()
    {
        double s = (side1 + side2 + side3) / 2; //semi-perimeter
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); //Heron's formula
    }

    //method to display data
    public void displayData()
    {
        calculatePerimeter(); //calling method
        calculateArea();      //calling method

        System.out.println("--------------------------------------------");
        System.out.println("Sides of the Triangle are: " + side1 + ", " + side2 + ", " + side3);
        System.out.println("--------------------------------------------");
        System.out.println("Perimeter of Triangle = " + perimeter);
        System.out.println("Area of Triangle = " + area);
        System.out.println("--------------------------------------------");
    }
}

//------------------------//
public class Triangle {

    public static void main(String[] args) {
        //Creating object of TriangleCalculator class
        TriangleCalculator triangle = new TriangleCalculator();
        triangle.displayData();
    }
}