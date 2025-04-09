import java.util.Scanner;
public class Bmi{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Kindly input weight in pounds: ");
double weight = input.nextDouble();

System.out.print("Kindly input height in inches: ");
double height = input.nextDouble();

weight *= 703;
height *= height;

double BMI = weight / height;

System.out.printf("BMI is %.4f", BMI);
}
}