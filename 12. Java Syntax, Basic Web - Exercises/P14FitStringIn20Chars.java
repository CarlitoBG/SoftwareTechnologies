import java.util.Scanner;

public class P14FitStringIn20Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        if (string.length() < 20){

            StringBuilder sb = new StringBuilder();
            sb.append(string);

            for (int i = string.length() + 1; i <= 20; i++) {
                sb.append("*");
            }

            System.out.println(sb);
        }else {
            System.out.println(string.substring(0, 20));
        }
    }
}