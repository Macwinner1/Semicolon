import java.util.Scanner;

public class ThreeHigherThan{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Input the first number: ");
int number1 = input.nextInt();
System.out.print("Input the second number: ");
int number2 = input.nextInt();
System.out.print("Input the third number: ");
int number3 = input.nextInt();

if(number1 < number2 && number2 < number3){
System.out.print("The result is: True");
}
else{
System.out.print("The result is: False");
}

}
}