package Bryan.bookstore;

public class Customer extends Person{

    public Customer(String name) {
        super(name);
    }



    public void buyBook(){
        System.out.println(this.getName() + " bought a book!");
    }

}
