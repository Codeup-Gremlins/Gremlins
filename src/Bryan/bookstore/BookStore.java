package Bryan.bookstore;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
    public static void main(String[] args) {

        Author vonnegut = new Author("Kurt Vonnegut", 11);
        Author tolkien = new Author("JRR Tolkien", 29);
        Author rowling = new Author("JK Rowling", 30);

        Book cradle = new Book("Cat's Cradle", 8.97, vonnegut);
        Book breakfast = new Book("Breakfast of Champions", 7.95, vonnegut);

        Book hobbit = new Book("The Hobbit", 22.02, tolkien);
        Book silmarillion = new Book("The Silmarillion", 6.14, tolkien);

        Book sorceror = new Book("Harry Potter and the Sorcerer's Stone", 8.74, rowling);
        Book goblet = new Book("Harry Potter and the Goblet of Fire", 7.79, rowling);

        List<Customer> customers = new ArrayList<>();
        Customer sophie = new Customer("Sophie");
        Customer fer = new Customer("Fer");
        Customer david = new Customer("David");
        Customer justin = new Customer("Justin");
        Customer vivian = new Customer("Vivian");
        Customer daniel = new Customer("Daniel");
        Customer trant = new Customer("Trant");
        Customer ryan = new Customer("Ryan");
        Customer doug = new Customer("Doug");

    customers.add(sophie);
    customers.add(fer);
    customers.add(david);
    customers.add(justin);
    customers.add(vivian);
    customers.add(daniel);
    customers.add(trant);
    customers.add(ryan);
    customers.add(doug);

    for(Customer customer : customers){
        customer.buyBook();
    }

        System.out.println("\n~*~*~*~*~*~*~*~*~*~*~*\n");

        System.out.println(cradle.bookInfo());
        System.out.println(breakfast.bookInfo());
        System.out.println(hobbit.bookInfo());
        System.out.println(silmarillion.bookInfo());
        System.out.println(sorceror.bookInfo());
        System.out.println(goblet.bookInfo());


    }

}
