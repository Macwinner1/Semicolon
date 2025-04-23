import java.util.Scanner;

public class PalindromName{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter any name: ");
String name = input.nextLine();
String back = "";


for(int i = name.length()-1; i >= 0; i--){
back = back + name.charAt(i);

}

if(name.equals(back)){
System.out.print("This is a Palindrom Name: " + name);

}
else{
System.out.print("This is not a Palindrom Name: " + name);

}

}

}