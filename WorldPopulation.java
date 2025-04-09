import java.util.Scanner;

public class WorldPopulation{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Please enter the World Population :");
double WorldPopulation = input.nextDouble();
System.out.println("Please enter the Annual World Population Growth Rate :");
double GrowthRate = input.nextDouble();

double percentage = 1.2 / 100;
double yearOne = WorldPopulation * (1 + percentage);
double yearTwo = yearOne * (1 + percentage);
double yearThree = yearTwo * (1 + percentage);
double yearFour = yearThree * (1 + percentage);
double yearFive = yearFour * (1 + percentage);

System.out.println("This is the World Population :" + WorldPopulation);
System.out.println("This is the Annual World Population Growth Rate :" + GrowthRate);
System.out.println("Estimated One Year World Population :" + yearOne);
System.out.println("Estimated Two Year's World Population :" + yearTwo);
System.out.println("Estimated Three Year's World Population :" + yearThree);
System.out.println("Estimated Four Year's World Population :" + yearFour);
System.out.println("Estimated Five Year's World Population :" + yearFive);

}
}