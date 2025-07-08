package BillCalculator;

public class ReceiptDemo {
    public static void main(String[] args) {
        new ReceiptDemo().run();
    }
    private void run() {
        Receipt r = new Receipt(new Printer());

        r.add("Okafor", new Money("2.0", "GBP"));
        r.add("Mazi", new Money("3.0", "GBP"));
        r.add("Igwe", new Money("6.0", "GBP"));
        r.add("move", new Money("24.0", "GBP"));
    }
}
