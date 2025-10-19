public class Main {
    public static void main(String[] args) {
        // Создаем библиотеку
        Library library = new Library();
        
        // Создаем книги
        Book book1 = new Book("1984", "Джордж Оруэлл");
        Book book2 = new Book("Мастер и Маргарита", "Михаил Булгаков");
        
        // Добавляем книги в библиотеку
        library.addBook(book1);
        library.addBook(book2);
        
        // Показываем все книги
        library.showAllBooks();
    }
}