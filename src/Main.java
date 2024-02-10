import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Newton newton = new Newton();
        SecantSquareRoot secantSquareRoot = new SecantSquareRoot();

        System.out.println("Hello world!");

        System.out.println("Newton");
        // Declare a Scanner class object
        Scanner sc = new Scanner(System.in);

        // Declare a DecimalFormat class object
        DecimalFormat fourDecimal = new DecimalFormat("0.0000");

        System.out.println("Program: find square roots by Newton's Method");
        System.out.println("Please enter a number: ");
        float number = sc.nextFloat();

        float root = newton.computeSquareRoot(number);
        System.out.println("The square root of " + number + " is " + fourDecimal.format(root));

        System.out.println("Secant Square Root");
        // Declare a Scanner class object
        sc = new Scanner(System.in);

        // Declare a DecimalFormat class object
        fourDecimal = new DecimalFormat("0.0000");

        System.out.println("Program: find square root using the secant method");
        System.out.println("Please enter a positive number: ");
        double positiveNumber = sc.nextDouble();

        double secantSquareRootResult = secantSquareRoot.computeSquareRoot(positiveNumber);
        System.out.println("The square root of " + positiveNumber + " is " + fourDecimal.format(secantSquareRootResult));

    }
}