
import java.util.Scanner; //importing Scanner class for user input

//----- Defining a class for Simple Interest Calculator ----//
class SimpleInterestCalculator
{
    float principal, rate, time; //declaration of variables
    float simpleInterest; //variable to store calculated simple interest

    //Constructor
    public SimpleInterestCalculator()
    {
        Scanner sc = new Scanner(System.in); //Creating object of Scanner class

        //Taking input from user
        System.out.print("Enter Principal amount: ");
        principal = sc.nextFloat();

        System.out.print("Enter Rate of Interest: ");
        rate = sc.nextFloat();

        System.out.print("Enter Time (in years): ");
        time = sc.nextFloat();

        sc.close(); //closing scanner object to avoid resource leak
    }

    //Method to calculate Simple Interest
    private void calculateSimpleInterest()
    {
        simpleInterest = (principal * rate * time) / 100; //formula for SI
    }

    //Method to display result
    public void displayData()
    {
        calculateSimpleInterest(); //calling method to compute SI
        System.out.println("--------------------------------------------");
        System.out.println("Principal = " + principal);
        System.out.println("Rate = " + rate + "%");
        System.out.println("Time = " + time + " years");
        System.out.println("Simple Interest = " + simpleInterest);
        System.out.println("--------------------------------------------");
    }
}

/*------------------------*/
public class SimpleInterestProgram {

    public static void main(String[] args) {
        //Creating object of SimpleInterestCalculator class
        SimpleInterestCalculator si = new SimpleInterestCalculator();
        si.displayData();
    }
}
