import java.util.LinkedHashMap;
import java.util.Scanner;

public class P18Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        LinkedHashMap<String, String> phonebook = new LinkedHashMap<>();

        while (!inputLine.equals("END")){

            String[] inputParams = inputLine.split(" ");

            if (inputParams[0].equals("A")){
                String name = inputParams[1];
                String phoneNumber = inputParams[2];

                if (!phonebook.containsKey(name)){
                    phonebook.put(name, "");
                }
                phonebook.put(name, phoneNumber);
            }else {
                String name = inputParams[1];

                if (phonebook.containsKey(name)){
                    System.out.printf("%s -> %s\n", name, phonebook.get(name));
                }else{
                    System.out.printf("Contact %s does not exist.\n", name);
                }
            }

            inputLine = scanner.nextLine();
        }
    }
}