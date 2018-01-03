import java.util.Arrays;
import java.util.Scanner;

public class P06Largest3Numbers {
    public static void main(String[] args) {
        int[] numbers = Arrays
                .stream(new Scanner(System.in).nextLine().split("\\s"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(numbers);

        int count = Math.min(3, numbers.length);

        for (int i = 0; i < count; i++) {
            System.out.println(numbers[numbers.length - i - 1]);
        }
    }
}