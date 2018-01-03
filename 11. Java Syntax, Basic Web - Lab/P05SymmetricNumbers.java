import java.util.ArrayList;
import java.util.Scanner;

public class P05SymmetricNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> symmetricNumbers = new ArrayList<Integer>();

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (isSymmetric(Integer.toString(i))){
                symmetricNumbers.add(i);
            }
        }

        for (int i = 0; i < symmetricNumbers.size(); i++) {
            System.out.printf("%d ", symmetricNumbers.get(i));
        }
    }

    private static boolean isSymmetric(String numberAsString) {
        for (int i = 0; i <= numberAsString.length() / 2; i++) {
             if (numberAsString.charAt(i) != numberAsString.charAt(numberAsString.length() - i - 1)){
                 return false;
             }
        }

        return true;
    }
}