import java.util.Scanner;
public class SubtractionQuiz{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

int counter = 1;
int failed = 0;
int passed = 0;

while(counter <= 5){
int number1 = (int)(Math.random() * 21);
int number2 = (int)(Math.random() * 21);
int result = number1 - number2;

System.out.println("What is " + number1 + " - " + number2 + " ?: ");
int answer = input.nextInt();

if(answer != result){
System.out.println("Wrong Answer, Try again ");
failed++;
}
else {
System.out.println("Wow you are correct! ");
passed++;
}



counter++;
}
System.out.println("Total number of failed questions: " + failed);
System.out.println("Total number of Correct Answers: " + passed);


}

}