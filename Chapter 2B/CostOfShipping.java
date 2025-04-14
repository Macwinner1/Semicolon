import java.util.Scanner;

public class CostOfShipping{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the weight of your package (in pounds): ");
double number = input.nextDouble();

if(number > 0 && number <= 1){
System.out.print("Price: $3.5");
}

if(number > 1 && number <= 3 ){
System.out.print("Price: $5.5");
}

if(number > 3 && number <= 10 ){
System.out.print("Price: $8.5");
}

if(number > 10 && number <= 20 ){
System.out.print("Price: $10.5");
}

if(number >= 21){
System.out.print("The package cannot be shipped");
}



}


}