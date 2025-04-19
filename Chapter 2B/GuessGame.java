import java.util.Scanner;
public class GuessGame{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
int guess = (int)(Math.random() * 101);
int number = -1;

while(guess != number){
System.out.println("Kindly input a number from 1 - 100 for guess: ");
number = input.nextInt();

if(number == guess){
System.out.print("Congratulation your guess is right! ");
}
else if(number > guess){
System.out.println("Your guess is too High!, Try again.");
}
else{
System.out.println("Your guess is too low!, Try again. ");
}


}

}

}