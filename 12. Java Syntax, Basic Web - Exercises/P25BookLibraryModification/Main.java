package P25BookLibraryModification;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int booksCount = Integer.parseInt(scanner.nextLine());

        BookLibrary library = new BookLibrary() {{
            setName("Prosveta");
            setBooks(new ArrayList<>());
        }};

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        for (int i = 0; i < booksCount; i++) {
            String[] bookParams = scanner.nextLine().split(" ");

            Book book = new Book() {{
                setTitle(bookParams[0]);
                setAuthor(bookParams[1]);
                setPublisher(bookParams[2]);
                setReleaseDate(LocalDate.parse(bookParams[3], formatter));
                setIsbn(bookParams[4]);
                setPrice(Double.parseDouble(bookParams[5]));
            }};

            library.getBooks().add(book);
        }

        LocalDate releaseDate = LocalDate.parse(scanner.nextLine(), formatter);

        Book[] sortedBooks = library.getBooks()
                .stream()
                .filter(a -> a.getReleaseDate().isAfter(releaseDate))
                .sorted((a, b) -> {
                    int comparisonResult = a.getReleaseDate().compareTo(b.getReleaseDate());

                    if (comparisonResult == 0){
                        comparisonResult = a.getTitle().compareTo(b.getTitle());
                    }

                    return comparisonResult;
                })
                .toArray(Book[]::new);

        for (Book book : sortedBooks) {
            System.out.printf("%s -> %s%n", book.getTitle(), formatter.format(book.getReleaseDate()));
        }
    }
}