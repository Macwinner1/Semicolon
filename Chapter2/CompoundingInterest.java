import java.util.Scanner;

public class CompoundingInterest{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

double principal;
double rate;
int timeCompounded;
int years;
double amount;

System.out.print("Enter your Principal amount: ");
principal = input.nextDouble();

System.out.print("Enter your Interest rate: ");
rate = input.nextDouble() / 100;

System.out.print("Enter time compounded: ");
timeCompounded = input.nextInt();

System.out.print("Enter Years: ");
years = input.nextInt();

amount = principal *  Math.pow(1 + rate / timeCompounded, timeCompounded * years);

System.out.printf("my principal: %.2f\nmy rate: %.2f\nTime compounded: %d\nYears: %d\nAmount: %.2f", principal, rate, timeCompounded, years, amount);


input.close();
}


}