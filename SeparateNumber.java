import java.util.Scanner;
public class SeparateNumber{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Kindly input only six digits");
int number = input.nextInt();
String Gap = " ";
if(number < 100000 || number > 999999){
System.out.println("Sorry this is not a six digit number");
}
else {
int first = number % 10;
number = number / 10;
int second = number % 10;
number = number / 10;
int third = number % 10;
number = number / 10;
int fourth = number % 10;
number = number / 10;
int fifth = number % 10;
number = number / 10;
int sixth = number % 10;
System.out.println(sixth + Gap + fifth + Gap + fourth + Gap + third + Gap + second + Gap + first);
}

}//close method
}//close class