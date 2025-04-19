import java.util.Scanner;
import java.util.Random;

public class MysteryGameLoop4{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
Random random = new Random();

int randomNumber;
int guessNumber;
int counter = 1;

for(; counter < 7;){
System.out.println("New Random number Alert.. ");
randomNumber = random.nextInt(1, 10);

for(int counter2 = 1; counter2 < 4; counter2++){
System.out.print("Enter any number for a guess: ");
guessNumber = input.nextInt();
if(guessNumber == randomNumber){
System.out.println("Congratulations! You won.. it's a match");
System.out.println("Total number guessed: " + (counter * counter2));
break;
}
else{
if(guessNumber > randomNumber){
System.out.println("Number is too high");
}
if(guessNumber < randomNumber){
System.out.println("Number is too low");
}
}
}
counter++;
}
}
}