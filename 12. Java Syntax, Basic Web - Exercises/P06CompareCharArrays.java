import java.util.Scanner;

public class P06CompareCharArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] arr1 = scanner.nextLine().replaceAll("\\s+", "").toCharArray();
        char[] arr2 = scanner.nextLine().replaceAll("\\s+", "").toCharArray();

        int arrLength = Math.min(arr1.length, arr2.length);

        for (int i = 0; i < arrLength; i++) {

            if (arr1[i] < arr2[i]) {
                System.out.println(arr1);
                System.out.println(arr2);
                return;
            } else if (arr1[i] > arr2[i]) {
                System.out.println(arr2);
                System.out.println(arr1);
                return;
            }
        }

        if (arr1.length < arr2.length) {
            System.out.println(arr1);
            System.out.println(arr2);
        } else {
            System.out.println(arr2);
            System.out.println(arr1);
        }
    }
}