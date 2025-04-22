import java.util.Scanner;
public class HealthApplications{
public static void main(String[] args);

Scanner input = new Scanner(System.in);

System.out.print("Enter weight in pounds :");
double weight = input.nextDouble();

System.out.print("Enter height in inches :");
double height = input.nextDouble();

double BMI = weight / height * height;

System.out.printf("BMI is " + BMI);

}