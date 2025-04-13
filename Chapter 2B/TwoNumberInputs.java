import java.util.Scanner;

public class TwoNumberInputs{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter first number: ");
int number1 = input.nextInt();

System.out.print("Enter second number: ");
int number2 = input.nextInt();

int result = number1 * number2;

System.out.print("Expected Output : " + result);

}
}