import java.util.Scanner;

public class TaxCalculator{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int total = 0;

for(int counter = 1; counter <= 3; counter++){
System.out.print("Enter Citizen Name:");
String name = input.nextLine();

System.out.print("Enter Citizen earning:");
int amount = input.nextLine();

if(amount > 30000){
total = amount / 0.20;
}
if(amount <= 30000){
total = amount / 0.15;
}
}

}

}