import java.util.Scanner;
import java.util.TreeMap;

public class P19PhonebookUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        TreeMap<String, String> phonebook = new TreeMap<>();

        while (!inputLine.equals("END")) {

            String[] inputParams = inputLine.split(" ");

            if (inputParams[0].equals("A")) {
                String name = inputParams[1];
                String phoneNumber = inputParams[2];

                if (!phonebook.containsKey(name)) {
                    phonebook.put(name, "");
                }
                phonebook.put(name, phoneNumber);
            }else if (inputParams[0].equals("S")){
                String name = inputParams[1];

                if (phonebook.containsKey(name)){
                    System.out.printf("%s -> %s\n", name, phonebook.get(name));
                }else{
                    System.out.printf("Contact %s does not exist.\n", name);
                }
            } else if (inputLine.equals("ListAll")) {
                for (String name : phonebook.keySet()) {
                    System.out.printf("%s -> %s\n", name, phonebook.get(name));
                }
            }

            inputLine = scanner.nextLine();
        }
    }
}