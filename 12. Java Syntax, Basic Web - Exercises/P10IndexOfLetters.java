import java.util.Scanner;

public class P10IndexOfLetters {
    public static void main(String[] args) {
        char[] alphabet = new char[26];

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char)(i + 97);
        }

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i) + " -> " + new String(alphabet).indexOf(word.charAt(i)));
        }
    }
}