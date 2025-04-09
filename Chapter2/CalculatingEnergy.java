import java.util.Scanner;

public class CalculatingEnergy{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the Amount of water in kilograms :");
double waterKilograms = input.nextDouble();

System.out.print("Enter the initial temperature :");
double initialTemperature = input.nextDouble();

System.out.print("Enter the final temperature :");
double finalTemperature = input.nextDouble();

double energy = waterKilograms * (finalTemperature - initialTemperature) * 4184;

System.out.printf("The energy needed is %.1f", energy);
}

}