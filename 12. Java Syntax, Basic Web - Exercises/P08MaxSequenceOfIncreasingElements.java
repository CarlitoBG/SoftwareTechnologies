import java.util.Arrays;
import java.util.Scanner;

public class P08MaxSequenceOfIncreasingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int start = 0;
        int length = 1;

        int bestStart = 0;
        int bestLength = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]){
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
            maxSequence[i] = nums[bestStart + i];
        }

        for (int num : maxSequence) {
            System.out.print(num + " ");
        }
    }
}