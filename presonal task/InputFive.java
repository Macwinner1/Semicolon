import java.util.Scanner;

public class InputFive{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int largest = 0;
int smallest = 0;

int sum = 0;


System.out.println("Enter any 5 number of your choice: ");
int number1 = input.nextInt();
int number2 = input.nextInt();
int number3 = input.nextInt();
int number4 = input.nextInt();
int number5 = input.nextInt();

smallest = number1;
if(number2 <= smallest){
smallest = number2;
}
else if (number2 >= smallest){
largest = number2;
}

if(number3 <= smallest){
smallest = number3;
}
else if (number3 >= smallest){
largest = number3;
}

if(number4 <= smallest){
smallest = number4;
}
else if (number4 >= smallest){
largest = number4;
}

if(number5 <= smallest){
smallest = number5;
}
else if (number5 >= smallest){
largest = number5;
}

sum = smallest + largest;

System.out.println("This your smallest number: " + smallest);
System.out.println("This your largest number: " + largest);
System.out.println("This is the sum of smallest and largest number: " + sum);

}

}