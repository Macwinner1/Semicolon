import java.util.Scanner;
import java.util.Random;

public class HeadsTails{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
int head = 0;
int tail = 1;

System.out.print("Enter Head(0) or Tails(1)");
int number = input.nextInt(); 

if(number < 0.01 && number == 0){
head = number;
System.out.print("this is head " + head);
}
else if(number <= 1){
tail = number;
System.out.print("this is tail " + tail);
}

Random randon = new Random();

int isHeads = random.nextInt(0);
int isTails = random.nextInt(1);

if(isHeads == head){
System.out.print("it is a head you guessed right");
}
else{
System.out.print("Tails");
}




}
}