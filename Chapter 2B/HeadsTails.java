import java.util.Scanner;
import java.util.Random;

public class HeadsTails{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
Random random = new Random();

int isRand = random.nextInt(1, 2);

System.out.print("Enter Head(0) or Tails(1)");
int number = input.nextInt(); 

if(number == isRand){
System.out.print("Your Correct!!..");
}

else if(number != isRand){
System.out.print("Your  InCorrect!!..");
}

}
}