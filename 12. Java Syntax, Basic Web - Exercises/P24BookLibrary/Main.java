package P24BookLibrary;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int booksCount = Integer.parseInt(scanner.nextLine());

        BookLibrary library = new BookLibrary(){{
           setName("Prosveta");
           setBooks(new ArrayList<>());
        }};

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        for (int i = 0; i < booksCount; i++) {
            String[] bookParams = scanner.nextLine().split(" ");

            Book book = new Book(){{
               setTitle(bookParams[0]);
               setAuthor(bookParams[1]);
               setPublisher(bookParams[2]);
               setReleaseDate(LocalDate.parse(bookParams[3],formatter));
               setIsbn(bookParams[4]);
               setPrice(Double.parseDouble(bookParams[5]));
            }};

            library.getBooks().add(book);
        }

        library.getBooks().stream()
                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.summingDouble(Book::getPrice)))
                .entrySet()
                .stream()
                .sorted((a, b) -> {
                    int comparisonResult = Double.compare(b.getValue(), a.getValue());

                    if (comparisonResult == 0){
                        comparisonResult = a.getKey().compareTo(b.getKey());
                    }

                    return comparisonResult;
                })
                .forEach((kvp) -> {
                    String author = kvp.getKey();
                    double totalSum = kvp.getValue();
                    System.out.printf("%s -> %.2f%n", author, totalSum);
                });
    }
}