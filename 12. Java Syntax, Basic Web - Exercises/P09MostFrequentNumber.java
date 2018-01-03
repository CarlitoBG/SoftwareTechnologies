import java.util.Arrays;
import java.util.Scanner;

public class P09MostFrequentNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int maxCount = 0;
        int mostFrequentNum = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {
            int counter = 1;

            for (int j = i + 1; j < nums.length; j++) {
               if (nums[j] == nums[i]){
                   counter++;
               }
            }

            if (counter > maxCount){
                maxCount = counter;
                mostFrequentNum = nums[i];
            }
        }

        System.out.println(mostFrequentNum);
    }
}