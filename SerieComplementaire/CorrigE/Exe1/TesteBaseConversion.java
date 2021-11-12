import java.util.Scanner;

public class TesteBaseConversion {

    public static void main(String[] args) {
        char[] baseDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        int convertedNumber[] = new int[64];

        int nextDigit, index = 0;
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Number to be converted? ");
        long numberToConvert = inputScanner.nextLong();
        System.out.println("In what base to you want to converte the number ?");
        int base = inputScanner.nextInt();
        do {
            convertedNumber[index] = (int) (numberToConvert % base);
            ++index;
            numberToConvert = numberToConvert / base;
        } while (numberToConvert != 0);
        inputScanner.close();

        // to display the results

        System.out.print("Converted Number = \t");
        for (--index; index >= 0; --index) {
            nextDigit = convertedNumber[index];
            System.out.print(baseDigits[nextDigit]);
        }

    }

}
