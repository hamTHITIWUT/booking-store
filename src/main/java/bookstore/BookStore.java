package bookstore;

import java.util.List;

public class BookStore {
    private String name="MyBookStore";

    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        bookStore.process();

    }

    private void process() {
        Customer ham = new Customer(1, "mooham");
    }

    private void addToBasket() {
        //TODO
    }

    private void buy() {
        //TODO
    }

    private List<Book> listOfBooks() {
        //TODO
        return null;
    }

}
