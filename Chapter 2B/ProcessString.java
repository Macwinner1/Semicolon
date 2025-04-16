import java.util.Scanner;
public class ProcessString{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
String number = "";
System.out.print("Enter your Social Security number in this format DDD-DD-DDDD:");
number = input.next();

String mainNumber = "232-23-5435";

if(number == mainNumber){
System.out.printf("%s is a valid social security number", number);
}
else{
if(number != mainNumber){
System.out.printf("%s is an invalid social security number", number);
}
}


}

}