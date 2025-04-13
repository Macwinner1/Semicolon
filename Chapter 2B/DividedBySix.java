import java.util.Scanner;

public class DividedBySix{
public static void main(String[] args){
Scanner input = new Scanner(System.in);


System.out.print("Kindly enter 2 integer: ");
int number1 = input.nextInt();
int number2 = input.nextInt();

if(number1 > number2){
System.out.print("The Result: " + number1);
}
if(number2 > number1){
System.out.print("The Result: " + number2);
}
else if(number2 == number1){
int reminder1 = number1 / 6;
int reminder2 = number2 / 6;
if(reminder1 == reminder2){
System.out.println("the smallest number of reminder is: " + reminder1);
}
System.out.print("The Result: 0");

}



}

}