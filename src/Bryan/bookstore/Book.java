package Bryan.bookstore;

public class Book extends Product {

    public Author author;

    public Book(String title, double price, Author author) {
        super(title, price);
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public String bookInfo(){
        return this.title + " by " + this.author.name + "\n Price = " + this.price;
    }
}
