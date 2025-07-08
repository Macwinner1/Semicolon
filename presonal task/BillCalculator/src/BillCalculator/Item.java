package BillCalculator;

public class Item {
    private String description;
    private Money price;

    public Item(String description, Money price) {
        this.description = description;
        this.price = price;
    }

    public void print(Printer p) {
        new ItemFormat(description, price).print(p);
    }
}
