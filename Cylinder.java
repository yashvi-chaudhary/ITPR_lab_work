import java.util.Scanner; //importing Scanner class for user input

//----- Defining a class for Cylinder Calculations ----//
class CylinderCalculator
{
    double radius, height; //declaring radius and height
    double csa, tsa, volume; //variables to store results

    //Constructor
    public CylinderCalculator()
    {
        Scanner sc = new Scanner(System.in); //Creating object of Scanner class

        System.out.print("Enter radius of the cylinder: ");
        radius = sc.nextDouble();

        System.out.print("Enter height of the cylinder: ");
        height = sc.nextDouble();

        sc.close(); //closing scanner object to avoid resource leak
    }

    //method to calculate Curved Surface Area
    private void calculateCSA()
    {
        csa = 2 * Math.PI * radius * height; //formula for CSA
    }

    //method to calculate Total Surface Area
    private void calculateTSA()
    {
        tsa = 2 * Math.PI * radius * (radius + height); //formula for TSA
    }

    //method to calculate Volume
    private void calculateVolume()
    {
        volume = Math.PI * radius * radius * height; //formula for volume
    }

    //method to display results
    public void displayData()
    {
        calculateCSA();    //calling method to calculate CSA
        calculateTSA();    //calling method to calculate TSA
        calculateVolume(); //calling method to calculate Volume

        System.out.println("--------------------------------------------");
        System.out.println("Radius = " + radius + ", Height = " + height);
        System.out.println("--------------------------------------------");
        System.out.println("Curved Surface Area (CSA) = " + csa);
        System.out.println("Total Surface Area (TSA) = " + tsa);
        System.out.println("Volume = " + volume);
        System.out.println("--------------------------------------------");
    }
}

//------------------------//
public class Cylinder {

    public static void main(String[] args) {
        //Creating object of CylinderCalculator class
        CylinderCalculator cylinder = new CylinderCalculator();
        cylinder.displayData();
    }
}