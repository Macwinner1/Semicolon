import java.util.Scanner;

public class StudentCounterWhile{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

int passed = 0;
int failed = 0;
int studentCounter = 1;

while(studentCounter <= 10){
System.out.print("Kindly enter Results(1 for Passed and 2 for Failed) :");
int result = input.nextInt();

if(result == 1){
passed = passed + 1;
}
else{
failed = failed + 1;
}
studentCounter = studentCounter + 1;
}//close while loop

System.out.printf("Passed : %d%nFailed : %d%n", passed, failed);

if(passed >= 7){
System.out.println("Semicolon deserves a big bonus! ");
}

}
}