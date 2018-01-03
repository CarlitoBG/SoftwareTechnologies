import java.util.Scanner;

public class P04VowelOrDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol = scanner.nextLine().charAt(0);

        if (Character.isDigit(symbol)){
            System.out.println("digit");
        }else if ("AEIOUaeiou".indexOf(symbol) != -1){
            System.out.println("vowel");
        }else{
            System.out.println("other");
        }
    }
}