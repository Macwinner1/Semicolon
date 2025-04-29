import java.util.Scanner;

 
public class BudgetAmount{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter your Budget: ");
double amount = input.nextDouble();

double liters = amount / 855;

System.out.printf("You can get the following liters of gas: %.2f", liters);


}

}