import java.util.Scanner;

public class P15CensorEmailAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email = scanner.nextLine();
        String text = scanner.nextLine();

        String[] emailParams = email.split("@");

        StringBuilder censoredEmail = new StringBuilder();

        for (int i = 0; i < emailParams[0].length(); i++) {
            censoredEmail.append("*");
        }

        String replacement = censoredEmail + "@" + emailParams[1];
        System.out.println(text.replace(email, replacement));
    }
}