import java.util.Scanner;
public class ProcessString{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a string:");
String name = input.next();
int length = name.length();

System.out.println("This is the length of your string: " + length);

int counter = length-2;
System.out.println("The last letter is : " + name.charAt(counter));

}

}