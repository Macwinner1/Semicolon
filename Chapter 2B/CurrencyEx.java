import java.util.Scanner;
import java.lang.AssertionError;

public class CurrencyEx{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
double amountDollar = 0;
double amountRmb = 0;
double dollarResult = 0;
double rmbResult = 0;
double covert = 0;
double counter = 0.01;
double rate;

System.out.print("Enter the exchange rate from dollars to RMB: ");
rate = input.nextDouble();

try
{
rate = 0;
}
catch(Exception e)
{
System.out.println("Sorry this is not a vaild rate.", + e);
}

if(rate >=0.01){
System.out.print("Enter 0 to convert dollars to RMB and 1 vice verse: ");
covert = input.nextDouble();
}


if(covert == 0){
System.out.print("Enter dollars amount: ");
amountDollar = input.nextDouble();
}
else if(covert == 1){
System.out.print("Enter dollars amount: ");
amountRmb = input.nextDouble();
}



if(amountRmb > counter){
rmbResult = amountRmb / rate;
System.out.printf("%.1f is %.1f Dollar", amountRmb, rmbResult);
}

else if(amountDollar > counter){
dollarResult = amountDollar * rate;
System.out.printf("%.1f is %.1f Yuan", amountDollar, dollarResult);
}
if(amountDollar < counter || amountRmb < counter){
System.out.print("Sorry this is invailed amount ");
}


}//else if close






}
