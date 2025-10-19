import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Книга добавлена в библиотеку!");
    }
    
    public void showAllBooks() {
        System.out.println("\nСписок книг в библиотеке:");
        for (Book book : books) {
            book.displayInfo();
        }
    }
}