import java.util.Scanner;

public class TestePalindrome {

    public static boolean isPalindrom(String str, int r, int l) {

        if (l <= r)
            return true;
        if (str.charAt(r) != str.charAt(l))
            return false;

        return isPalindrom(str, r + 1, l - 1);
    }

    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Donner une pour verifier : \t");
        String str = iScanner.nextLine();
        iScanner.close();
        System.out.println((isPalindrom(str, 0, str.length() - 1) ? "this " + str + " is Palindrom"
                : "this " + str + " is not Palindrom"));
    }
}