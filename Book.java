// Define a class named Book
class Book {
    // Declare attributes
    String titleOfTheBook;
    String author;
    int yearOfPublication;

    // Constructor to initialize values
    public Book(String titleOfTheBook, String author, int yearOfPublication) {
        this.titleOfTheBook = titleOfTheBook;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    // Create a method to display book details
    public void getBook() {
        System.out.println("The title of the book: " + titleOfTheBook);
        System.out.println("Author: " + author);
        System.out.println("Year of publication: " + yearOfPublication);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Treasure Island", "Robert Louis Stevenson", 1883);
        book1.getBook();

        Book book2 = new Book("The Lord of the Rings: The Fellowship of the Ring", "J.R.R. Tolkien", 1954);
        book2.getBook();

        Book book3 = new Book("Around the World in Eighty Days", "Jules Verne", 1873);
        book3.getBook();
    }
}
