import java.util.Scanner;

public class P16URLParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String url = scanner.nextLine();

        String protocol = "";
        String server = "";
        String resource = "";

        int protocolIndex = url.indexOf("://");

        if (protocolIndex > 0){
            protocol = url.substring(0, protocolIndex);
            url = url.substring(protocolIndex + 3);
        }

        int serverIndex = url.indexOf("/");

        if (serverIndex < 0){
            server = url;
        }else{
            server = url.substring(0, serverIndex);
            resource = url.substring(serverIndex + 1);
        }

        System.out.printf("[protocol] = \"%s\"\n", protocol);
        System.out.printf("[server] = \"%s\"\n", server);
        System.out.printf("[resource] = \"%s\"\n", resource);
    }
}