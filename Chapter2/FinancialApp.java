import java.util.Scanner;
public class FinancialApp{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter investment amount: ");
double amount = input.nextDouble();

System.out.print("Enter annual interest rate in percentage: ");
double rate = input.nextDouble();

System.out.print("Enter number of years: ");
double years = input.nextDouble() * 12;

double annualRate = rate / 100 *(12);

double futureValue = amount * ((1 + annualRate) * years);


System.out.printf("Accumulated value is %.2f", futureValue);


}


}