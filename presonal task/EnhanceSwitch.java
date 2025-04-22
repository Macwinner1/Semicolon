import java.util.Scanner;

public class EnhanceSwitch{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.print("Enter any day: ");

String day = input.nextLine();

switch(day.IgnoreCase){
case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> 
System.out.print("It is a weekday! ");
case "Saturday", "Sunday" -> 
System.out.print("It is the Weekend! ");
default -> System.out.print("Try again, this is not a Day!");
}

input.close();
}
}