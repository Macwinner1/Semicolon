import java.util.Scanner;

public class EvenOdd{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int evenNumber = 0;
int oddNumber = 0;

System.out.print("Enter any number :");
int number = input.nextInt();

if(number % 2 == 0){
evenNumber = evenNumber + number;
System.out.println("Even number :" + evenNumber);
}
if(number % 3 == 0){
oddNumber = oddNumber + number;
System.out.println("Odd number :" + oddNumber);
}


}

}