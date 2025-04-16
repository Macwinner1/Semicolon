import java.util.Scanner;
import java.util.Random;

public class RockPaperSicssor{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
Random random = new Random();

int scissor = 0;
int rock = 1;
int paper = 2;


System.out.print("Enter scissor (0), rock (1), paper (2): ");
int number = input.nextInt();
scissor = scissor == number;
rock = rock == number;
paper = paper == number;


int user = random.nextInt(0, 3);
int computer = random.nextInt(0, 3);


if(user == computer){
System.out.print("It is a Draw");
}
if(user == 0 && computer == 2){
System.out.print("You won!");
}
if(user == 0 && computer == 1){
System.out.print("Computer won!");
}
if(user == 1 && computer == 0){
System.out.print("You won!");
}
if(user == 2 && computer == 0){
System.out.print("Computer won!");
}
if(user == 1 && computer == 2){
System.out.print("Computer won!");
}
if(user == 2 && computer == 1){
System.out.print("You won!");
}


}

}