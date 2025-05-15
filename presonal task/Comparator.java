import java.util.Scanner;
public class Comparator{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

for(int count = 1; count < 2; count++){
System.out.print("Enter two positive numbers: ");
int number1 = input.nextInt();
int number2 = input.nextInt();

if(number1 > number2)
System.out.print("1");

if(number2 > number1)
System.out.print("-1");

if(number1 == number2)
System.out.print("0");

}

}

}