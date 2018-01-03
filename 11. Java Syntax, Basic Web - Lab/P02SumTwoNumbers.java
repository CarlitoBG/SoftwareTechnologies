import java.util.Scanner;

public class P02SumTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;

        System.out.printf("%.2f", sum);
    }
}