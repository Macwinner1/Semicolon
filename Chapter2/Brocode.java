import java.util.Scanner;
public class Brocode{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter your name: ");
String name = input.nextLine();

if(name.isEmpty()){
System.out.print("You didn't enter any name");
}
else{
System.out.print("Your name is: " + name);
}

input.close();
}

}