import java.util.Scanner;
public class HighAndLow{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.print("Enter numbers in form of String: ");
String number = input.nextLine();
String newNumber = number.replace(" ", "");
int length = newNumber.length();
int high = 0;
int low = 100000000;




for(int count = length; count > 0 ; count--){

int can = Integer.valueOf(newNumber);

int tan = can % 10;	
tan = can / 10;

if(tan < low){
low = tan;
}

if(tan > high){
high = tan;
}

}

System.out.println("this is your high number: " + newNumber);
System.out.println("this is your high number: " + high);
System.out.println("this is your low number: " + low);
}


}