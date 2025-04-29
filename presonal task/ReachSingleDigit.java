import java.util.Scanner;
public class ReachSingleDigit{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.print("Enter any number: ");
int number = input.nextInt();


for(int count = number; count >= 0 ; count--){
number = number % 10;
number = number / 10;


}

System.out.print(number);



}


}