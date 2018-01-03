import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int start = 0;
        int length = 1;

        int bestStart = 0;
        int bestLength = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]){
                start = i;
                length++;
            }else{
                start = i;
                length = 1;
            }

            if (bestLength < length){
                bestLength = length;
                bestStart = start;
            }
        }

        int[] maxSequence = new int[bestLength];

        for (int i = 0; i < bestLength; i++) {
           maxSequence[i] = nums[bestStart];
        }

        for (int num : maxSequence) {
            System.out.print(num + " ");
        }
    }
}