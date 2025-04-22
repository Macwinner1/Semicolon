import java.util.Scanner;

public class StringReverse{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter any name: ");
String name = input.nextLine();
String back = " ";

for(int i = name.length()-1; i >= 0; i--){

back = back + name.charAt(i);
}
System.out.print("This is the Reverse version of your name: " + back);


}

}