import java.util.Scanner;

public class SelectionLoop{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int selection;

do
{
String message = """
	Welcome to my App
	Press:
	
	1. Transfer
	2. Check balance
	3. Recharge
	4. Exit

""";
System.out.println("please enter amount");
selection = input.nextInt();

switch(selection){
	case 1: System.out.println("please enter amount");
		double amount = input.nextDouble(); break;

	case 2: System.out.println("Enter ID number"); break;

	case 3: System.out.println("Enter amount to be credited"); break;
}

}
while(selection < 4);
System.out.println("1. Transfer\n2.Check balance\n3.Recharge");
}


}