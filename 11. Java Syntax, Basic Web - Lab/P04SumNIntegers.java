import java.util.Scanner;

public class P04SumNIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += scanner.nextInt();
        }

        System.out.printf("Sum = %d", sum);
    }
}