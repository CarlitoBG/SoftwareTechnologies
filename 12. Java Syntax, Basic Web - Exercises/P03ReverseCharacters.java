import java.util.Scanner;

public class P03ReverseCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] letters = new char[3];

        for (int i = 0; i < letters.length; i++) {
            letters[i] = scanner.nextLine().charAt(0);
        }

        String reverse = new StringBuilder(new String(letters)).reverse().toString();

        System.out.println(reverse);
    }
}