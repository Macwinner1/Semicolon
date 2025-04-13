import java.util.Scanner;

public class CompleteNumberCheck{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter Number: ");
int number1 = input.nextInt();

System.out.print("Enter Number: ");
int number2 = input.nextInt();

int sum = number1 + number2;

int product = number1 * number2;

int average = (number1 + number2) / 2;

int distance = number1 - number2;

int largest = 0;

int smallest = 0;


if(number1 >= number2){
largest = number1;
}
else if(number2 <= number1){
smallest = number2;
}


if(number2 >= number1){
largest = number2;
}
else if(number1 <= number2){
smallest = number1;
}

System.out.println("Sum of two integers: " + sum);
System.out.println("Product of two integers: " + product);
System.out.println("Average of two integers: " + average);
System.out.println("Distance of two integers: " + distance);
System.out.println("Max integers: " + largest);
System.out.println("Min integers: " + smallest);


}

}