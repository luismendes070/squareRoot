import java.text.DecimalFormat;
import java.util.Scanner;

public class Newton {

    public static float computeSquareRoot(float number) {
        // Initialize variables
        float guess = number / 2; // Initial guess

        // Iterate until the difference between consecutive guesses is small enough
        while (Math.abs(guess * guess - number) > 0.0001) {
            guess = 0.5f * (guess + number / guess); // Newton-Raphson formula
        }

        return guess;
    }
}

