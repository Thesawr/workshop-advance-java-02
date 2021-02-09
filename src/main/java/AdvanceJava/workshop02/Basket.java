package AdvanceJava.workshop02;

import java.util.ArrayList;
import java.util.List;

public class Basket {
	List<Book> books = new ArrayList<>();
    private double netPrice;
    private double discountPrice;

    public void addBook(Book book) {
        books.add(book);
    }

    public double getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }
}
