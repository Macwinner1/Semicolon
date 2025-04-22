import java.util.Scanner;

public class MathSqrut{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

double a;
double b;
double c;

System.out.print("Enter any number for (Side A): ");
a = input.nextDouble();

System.out.print("Enter any number for (Side B): ");
b = input.nextDouble();

c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

System.out.printf("This is the SquareRoot: %.4fcm", c);


}

}