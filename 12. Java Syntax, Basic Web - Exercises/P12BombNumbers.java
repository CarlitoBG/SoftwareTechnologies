import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.Scanner;

public class P12BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        ArrayList<Integer> sequence = new ArrayList<>();

        for (int number : numbers) {
            sequence.add(number);
        }

        String[] input = scanner.nextLine().split(" ");
        int number = Integer.parseInt(input[0]);
        int power = Integer.parseInt(input[1]);

        for (int i = 0; i < sequence.size(); i++) {

            if (sequence.get(i) == number){

                int left = Math.max(i - power, 0);
                int right = Math.min(i + power, sequence.size() - 1);

                sequence.subList(left, right + 1).clear();
                i = 0;
            }
        }

        int sum = sequence.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}