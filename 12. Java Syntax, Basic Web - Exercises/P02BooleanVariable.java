import java.util.Scanner;

public class P02BooleanVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        boolean bool = Boolean.valueOf(string);

        if (bool){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}