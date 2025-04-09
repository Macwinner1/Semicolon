import java.util.Scanner;

public class PyramidOfGiza{
public static void main(String... args){
Scanner input = new Scanner(System.in);
System.out.println("Enter Estimated number of Stones used : ");
double StonesUsed = input.nextDouble();
System.out.println("Enter Average weight of each Stone : ");
double AverageWeightPerStone = input.nextDouble();
System.out.println("Enter Number of years taken to build the pyramid : ");
double NumberOfYears = input.nextDouble();

double YearlyStone = StonesUsed / NumberOfYears;
double YearlyWeightStone = YearlyStone * AverageWeightPerStone;
double HourlyStone = (YearlyStone / 365) / 24;
double HourlyWeightStone = HourlyStone * AverageWeightPerStone;
double MinuteStone = HourlyStone / 60;
double MinuteWeightStone = MinuteStone * AverageWeightPerStone;

System.out.printf("%n Estimated Pyramid Weight built each Year : " + YearlyWeightStone);
System.out.printf("%n Estimated Pyramid Weight built each Hour : " + HourlyWeightStone);
System.out.printf("%n Estimated Pyramid Weight built each Minute : " + MinuteWeightStone);

}


}