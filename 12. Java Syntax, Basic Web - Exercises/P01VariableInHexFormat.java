import java.util.Scanner;

public class P01VariableInHexFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String hexadecimalNum = scanner.nextLine();
        int decimalNum = Integer.parseInt(hexadecimalNum, 16);

        System.out.println(decimalNum);
    }
}