import java.util.Scanner;

public class CheckPalindromeNumber{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Kindly enter a number to check if is a palindrome number");
int number = input.nextInt();
if(number < 100 || number > 9999999){
System.out.println("Invalid number kindly input another number");
}
int lastNum = number % 10;
number = number / 10;
int last2Num = number %10;
number = number / 10;
int last3Num = number %10;
number = number / 10;
int first3Num = number % 10;
number = number / 10;
int first2Num = number % 10;
number = number / 10;
int firstNum = number % 10;
if(lastNum == firstNum && last2Num == first2Num && last3Num == first3Num){
System.out.print("This is a palindrome number :" + firstNum + first2Num + first3Num + last3Num + last2Num + lastNum);
}

}

}