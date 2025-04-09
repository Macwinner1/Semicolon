import java.util.Scanner;
public class NumberOfYears{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the minutes :");
long minutes = input.nextLong();

long days = minutes / 1440;
long years = days / 365;
long remainingDays = days % 365;


System.out.printf("%d minutes is approximately %d years and %d days", minutes, years, remainingDays);

}

}