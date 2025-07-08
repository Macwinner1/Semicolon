import BillCalculator.Bill;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BillCalculatorTest {
    @Test
    public void test_that_my_calculator_is_zero(){
        var bill = new Bill();
        float total = bill.getTotal();
        assertEquals(0,total);
    }
    @Test
    public void correctTotalForOneItem(){
        var bill = new Bill();
        bill.add(12);
        float total = bill.getTotal();
        assertEquals(12,total);
    }
    @Test
    public void correctTotalForTwoItems(){
        var bill = new Bill();
        bill.add(12);
        bill.add(12);
        float total = bill.getTotal();
        assertEquals(24,total);
    }

}
