package BillCalculator;

public class Bill {
    private float total;
    public float getTotal() {
        return total;
    }

    public void add(float price) {
        this.total += price;
    }


}
