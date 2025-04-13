import java.util.Scanner;
public class TwoIntegerDifference{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("Kindly input two integer to find there difference: ");
int number1 = input.nextInt();
int number2 = input.nextInt();

if(number1 > number2){
int result = number1 - number2;

System.out.print("Difference between the 2 numbers Output: " + result);
}


}

}