import java.util.Scanner;

public class PalindromNumbers{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter any number: ");
String back = "";
String number = input.nextLine();
int length = number.length();

for(int i = length-1; i >= 0; i--){
back = back + number.charAt(i);

}
if(number.equals(back)){
System.out.print("This is a Palindrom Number: " + number);
}
else{
System.out.print("This is not a Palindrom Number: " + number);
}

}

}