package BonusScheme;

public class Employee {
    private BonusScheme bonus;

    public Employee(BonusScheme bonus) {
        this.bonus = bonus;
    }

    Money totalPay(){
        Money pay = calculateBasePay();

        bonus.applyTo(pay);

        return pay;
    }
    private Money calculateBasePay(){

    }
}
