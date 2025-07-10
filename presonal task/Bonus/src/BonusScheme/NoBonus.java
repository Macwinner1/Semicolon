package BonusScheme;

public class NoBonus implements BonusScheme {
    void apply(Money pay){

    }
    class BonusTwenty{
        void apply(Money pay){
            pay.add(new Money("20.00"));
        }
    }
}
