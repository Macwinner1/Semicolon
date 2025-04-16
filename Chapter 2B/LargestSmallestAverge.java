import java.util.Scanner;
public class LargestSmallestAverge{
public static void main(String[] args){

int largest = 0;
int smallest = 0;
int average = 0;
int even = 0;
int divid = 0;

Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int number1 = input.nextInt();

System.out.print("Enter a number: ");
int number2 = input.nextInt();

System.out.print("Enter a number: ");
int number3 = input.nextInt();

System.out.print("Enter a number: ");
int number4 = input.nextInt();

System.out.print("Enter a number: ");
int number5 = input.nextInt();

if(number1 >= largest){
largest = number1;
}
if(number2 >= largest){
largest = number2;
}
if(number3 >= largest){
largest = number3;
}
if(number4 >= largest){
largest = number4;
}
if(number5 >= largest){
largest = number5;
}

if(number1 <= number2){
smallest = number1;
}
else if(number2 <= number1){
smallest = number2;
}
else if(number3 <= smallest){
smallest = number3;
}
else if(number4 <= smallest){
smallest = number4;
}
else if(number5 <= largest){
smallest = number5;
}

if(number1 % 2 == 0){
even += number1;
divid += 1;
}
if(number2 % 2 == 0){
even += number2;
divid += 1;
}
if(number3 % 2 == 0){
even += number3;
divid += 1;
}
if(number4 % 2 == 0){
even += number4;
divid += 1;
}
if(number5 % 2 == 0){
even += number5;
divid += 1;
}

average = even / divid;

System.out.println("\n Largest number: " + largest);
System.out.println("\n Smallest number: " + smallest);
System.out.println("\n Average of even number: " + average);

}

}