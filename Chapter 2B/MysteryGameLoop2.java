import java.util.Scanner;
import java.util.Random;

public class MysteryGameLoop2{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
Random random = new Random();

int randomNumber = random.nextInt(1, 10);
int guessNumber;
int counter = 1;
int counterTotal = 0;

while(counter != 0){
System.out.print("Enter any number for a guess: ");
guessNumber = input.nextInt();

if(guessNumber == randomNumber){
System.out.println("Congratulations! You won.. it's a match");
System.out.println("Total number guessed: " + counter);
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


counter++;
}

}

}