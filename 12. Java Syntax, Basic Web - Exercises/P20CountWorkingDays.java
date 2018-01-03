import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class P20CountWorkingDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate startDate = LocalDate.parse(scanner.nextLine(), formatter);
        LocalDate endDate = LocalDate.parse(scanner.nextLine(), formatter);

        LocalDate[] holidays = new LocalDate[] {
                LocalDate.of(2016, 1, 1),
                LocalDate.of(2016, 3, 3),
                LocalDate.of(2016, 5, 1),
                LocalDate.of(2016, 5, 6),
                LocalDate.of(2016, 5, 24),
                LocalDate.of(2016, 9, 6),
                LocalDate.of(2016, 9, 22),
                LocalDate.of(2016, 11, 1),
                LocalDate.of(2016, 12, 24),
                LocalDate.of(2016, 12, 25),
                LocalDate.of(2016, 12, 26)
        };

        int workingDaysCounter = 0;

        for (LocalDate i = startDate; i.isBefore(endDate.plusDays(1)); i = i.plusDays(1)) {

            LocalDate currentDay = LocalDate.of(2016, i.getMonth(), i.getDayOfMonth());

            if (!Arrays.asList(holidays).contains(currentDay)
                    && i.getDayOfWeek() != DayOfWeek.SATURDAY
                    && i.getDayOfWeek() != DayOfWeek.SUNDAY) {
                workingDaysCounter++;
            }
        }

        System.out.println(workingDaysCounter);
    }
}