import java.util.Scanner;
import java.util.Random;

public class RockPaperSicssorLoop{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
Random random = new Random();

int userTotal = 0;
int computerTotal = 0;
int counter = 1;
int draw = 0;


while(counter != 0){
System.out.println("Enter scissor (0), rock (1), paper (2): ");

int user = input.nextInt();
int computer = random.nextInt(3);

if(user == computer){
System.out.println("It is a Draw");
draw++;
}
else{
if(user == 0 && computer == 2){
System.out.println("You won!");
userTotal++;
}
else if(user == 0 && computer == 1){
System.out.println("Computer won!");
computerTotal++;
}
else if(user == 1 && computer == 0){
System.out.println("You won!");
userTotal++;
}
else if(user == 2 && computer == 0){
System.out.println("Computer won!");
computerTotal++;
}
else if(user == 1 && computer == 2){
System.out.println("Computer won!");
computerTotal++;
}
else if(user == 2 && computer == 1){
System.out.println("You won!");
userTotal++;
}
else{
System.out.println("You Lose!");
}
}

if(computerTotal == 2){
break;
}

if(userTotal == 2){
break;
}

counter++;
}
System.out.print("Total Score:\n" + "User:" + userTotal + " Computer: " + computerTotal + " Draw: " + draw);


}

}