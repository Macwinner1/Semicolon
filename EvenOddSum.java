import java.util.Scanner;

public class EvenOddSum{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter set of integers: ");

int number1 = input.nextInt();
int number2 = input.nextInt();
int number3 = input.nextInt();
int number4 = input.nextInt();
int number5 = input.nextInt();
int number6 = input.nextInt();

int totalEven = 0;
int totalOdd = 0;

if(number1 % 2 == 0){
totalEven += number1;
}
if(number1 % 3 == 0){
totalOdd += number1;
}

if(number2 % 2 == 0){
totalEven += number2;
}
if(number2 % 3 == 0){
totalOdd += number2;
}

if(number3 % 2 == 0){
totalEven += number3;
}
if(number3 % 3 == 0){
totalOdd += number3;
}

if(number4 % 2 == 0){
totalEven += number4;
}
if(number4 % 3 == 0){
totalOdd += number4;
}

if(number5 % 2 == 0){
totalEven += number5;
}
if(number5 % 3 == 0){
totalOdd += number5;
}

if(number6 % 2 == 0){
totalEven += number6;
}
if(number6 % 3 == 0){
totalOdd += number6;
}

System.out.println("This is the Sum of Even Number: " + totalEven);
System.out.println("This is the Sum of Odd Number: " + totalOdd);


}
}