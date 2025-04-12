import java.util.Scanner;

public class WorldPopulation{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Please enter the World Population :");
double WorldPopulation = input.nextDouble();


double percentage = 0.9 / 100; 


double yearOne = (long)WorldPopulation * (1 + percentage) * (1 + percentage);
double yearTwo = (long)yearOne * (1 + percentage) * (1 + percentage) * (1 + percentage);
double yearThree = (long)yearTwo * (1 + percentage) * (1 + percentage) * (1 + percentage) * (1 + percentage);
double yearFour = (long)yearThree * (1 + percentage) * (1 + percentage) * (1 + percentage) * (1 + percentage) * (1 + percentage);
double yearFive = (long)yearFour * (1 + percentage) * (1 + percentage) * (1 + percentage) * (1 + percentage) * (1 + percentage) * (1 + percentage);

System.out.println("This is the World Population :" + WorldPopulation);
System.out.println("This is the Annual World Population Growth Rate for First year: 9%");
System.out.println("Estimated One Year World Population :" + yearOne);
System.out.println("This is the Annual World Population Growth Rate for First year: 9%");
System.out.println("Estimated Two Year's World Population :" + yearTwo);
System.out.println("This is the Annual World Population Growth Rate for First year: 9%");
System.out.println("Estimated Three Year's World Population :" + yearThree);
System.out.println("This is the Annual World Population Growth Rate for First year: 9%");
System.out.println("Estimated Four Year's World Population :" + yearFour);
System.out.println("This is the Annual World Population Growth Rate for First year: 9%");
System.out.println("Estimated Five Year's World Population :" + yearFive);

}
}