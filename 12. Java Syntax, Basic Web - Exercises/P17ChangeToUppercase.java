import java.util.Scanner;

public class P17ChangeToUppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        while (text.contains("<upcase>")){

            String start = "<upcase>";
            String end = "</upcase>";

            int startIndex = text.indexOf(start);
            int endIndex = text.indexOf(end);

            String textToReplace = text.substring(startIndex, endIndex + end.length());
            String replacement = textToReplace
                    .substring(start.length(), textToReplace.length() - end.length()).toUpperCase();

            text = text.replace(textToReplace, replacement);
        }

        System.out.println(text);
    }
}