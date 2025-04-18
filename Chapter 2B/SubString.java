import java.util.Scanner;
public class SubString{
public static void main(String[] args){

String s1;
String s2;

Scanner input = new Scanner(System.in);

System.out.print("Enter string s1: ");
s1 = input.next();

System.out.print("Enter string s2: ");
s2 = input.next();

int length1 = Math.round(s1.length() / 2);
double length2 = s2.length();
//int length3 = Math.round(length1);


System.out.print(s1.charAt(length1));
System.out.print(length2);

}

}