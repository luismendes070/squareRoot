import java.text.DecimalFormat;
import java.util.Scanner;

public class SecantSquareRoot {

    public static double computeSquareRoot(double number) {
        // Initialize variables
        double x0 = number / 2.0; // Initial guess
        double x1 = x0 + 1.0;    // Another initial point

        // Set the tolerance (adjust as needed)
        double tol = 1e-6;

        // Iterate until the difference between consecutive guesses is small enough
        while (Math.abs(x1 - x0) > tol) {
            double f_x0 = x0 * x0 - number;
            double f_x1 = x1 * x1 - number;

            double x2 = x1 - f_x1 * (x1 - x0) / (f_x1 - f_x0);
            x0 = x1;
            x1 = x2;
        }

        return x1;
    }
}

