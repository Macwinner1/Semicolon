import java.util.Scanner;

public class CalculateInterest{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter balance :");
double balance = input.nextDouble();

System.out.print("Enter interest rate :");
double interestRate = input.nextDouble();

double annualInterestRate = interestRate / 1200;

double interest = balance * annualInterestRate;

System.out.printf("The interest is %.5f", interest);


}


}