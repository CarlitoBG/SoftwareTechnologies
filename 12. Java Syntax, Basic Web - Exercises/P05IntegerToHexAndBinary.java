import java.util.Scanner;

public class P05IntegerToHexAndBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        String hexadecimalNum = Integer.toHexString(num);
        String binaryNum = Integer.toBinaryString(num);

        System.out.println(hexadecimalNum.toUpperCase());
        System.out.println(binaryNum);
    }
}