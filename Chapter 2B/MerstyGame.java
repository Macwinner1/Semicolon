import java.util.Scanner;
import java.util.Random;

public class MerstyGame{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
Random random = new Random();
int randomNumber = random.nextInt(0, 11);


int number = 0;

System.out.print("Enter any number for a guess: ");
number = input.nextInt();

if(number == randomNumber){
System.out.println("Wow it's a match");
}
else{
if(number > randomNumber){
System.out.println("Number is too high");
}
if(number < randomNumber){
System.out.println("Number is too low");
}

System.out.print("Enter any number for a guess: ");
number = input.nextInt();

if(number == randomNumber){
System.out.println("Wow it's a match");
}
else{
if(number > randomNumber){
System.out.println("Number is too high");
}
if(number < randomNumber){
System.out.println("Number is too low");
}


System.out.print("Enter any number for a guess: ");
number = input.nextInt();

if(number == randomNumber){
System.out.println("Wow it's a match");
}

if(number > randomNumber){
System.out.println("The Randon number is: " + randomNumber);
System.out.println("Number is too high");
System.out.println("Game over");
}
else if(number < randomNumber){ 
System.out.println("The Randon number is: " + randomNumber);
System.out.println("Number is too low");
System.out.println("Game over");
}
}
}

}

}