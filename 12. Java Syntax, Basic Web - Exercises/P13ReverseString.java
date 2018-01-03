import java.util.Scanner;

public class P13ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] string = scanner.nextLine().toCharArray();

        StringBuilder sb = new StringBuilder(new String(string)).reverse();
        System.out.println(sb);
    }
}