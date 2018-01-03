import java.util.Scanner;
import java.util.TreeMap;

public class P07SumsByTown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, Double> sumsByTown = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] towns = scanner.nextLine().split("\\s+\\|\\s+");
            String nameOfTown = towns[0];
            double income = Double.parseDouble(towns[1]);

            if (!sumsByTown.containsKey(nameOfTown)){
                sumsByTown.put(nameOfTown, 0.0);
            }

            sumsByTown.put(nameOfTown, sumsByTown.get(nameOfTown) + income);
        }

        for (String key : sumsByTown.keySet()) {
            System.out.println(key + " -> " + sumsByTown.get(key));
        }
    }
}