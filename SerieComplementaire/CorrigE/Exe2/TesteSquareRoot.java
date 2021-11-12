import java.util.Scanner;

public class TesteSquareRoot {

    private static double absoluteValue(double d) {
        if (d < 0)
            d = -d;
        return (d);
    }

    public static double squareRoot(double d) {
        double epsilon = .00001;
        double guess = 1.0;
        while (absoluteValue(guess * guess - d) >= epsilon)
            guess = (d / guess + guess) / 2.0;
        return guess;
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("chose a number :\t");
        double squareRoot = inputScanner.nextDouble();
        inputScanner.close();

        System.out.println("the Square Root of " + squareRoot + " est = " + squareRoot(squareRoot));
    }
}
