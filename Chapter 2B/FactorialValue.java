import java.util.Scanner;
public class FactorialValue{
public static void main(String[] args){

int counter = 1;
int factorial = 0;
int result = 0;
int total = 0;

Scanner input = new Scanner(System.in);
System.out.print("Enter any number: ");
factorial = input.nextInt();

for(; counter <= factorial; ){
counter++;
result = factorial;
result += result * counter;
//total+= result;

}

System.out.print("This is the factorial value of " + factorial + ": " + result);
}

}