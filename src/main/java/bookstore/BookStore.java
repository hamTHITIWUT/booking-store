package bookstore;

import java.util.List;

public class BookStore {
    private String name = "WorkShopBookStore";

    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        bookStore.greetingCustomer();
        bookStore.process();
    }

    private void process() {
        Customer ham = new Customer(1, "mooham");

    }

    private void greetingCustomer() {
        System.out.println("Welcome to " + name);
    }

    private void addToBasket() {
        //TODO
    }

    private void buy(Customer customer) {
        //TODO
    }

    private List<Book> listOfBooks() {
        //TODO
        return null;
    }

}
