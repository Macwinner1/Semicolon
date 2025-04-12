import java.util.Random;

public class RandomNumber{
public static void main(String[] args){

Random random = new Random();

int number1 = random.nextInt(1, 7);
int number2 = random.nextInt(1, 7);
System.out.print(number1 + " ");
System.out.println(number2);


boolean isHeads = random.nextBoolean();

if(isHeads){
System.out.print("Heads");
}
else{
System.out.print("Tails");
}

}

}