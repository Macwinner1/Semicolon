import java.util.Scanner;
public class MultiplicationTable{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.print("Enter any positive number: ");
int number = input.nextInt();
System.out.printf("%-10s%-10s%n", "Number", "Multiply");
for(int counter = 1; counter <= 10; counter++){
	for(int counter2 = 1; counter2 <= 1; counter2++){
	System.out.printf("%-10d%-10d%n", counter, (counter * number));
}
}

}


}