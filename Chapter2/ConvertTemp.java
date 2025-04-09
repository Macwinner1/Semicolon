import java.util.Scanner;

public class ConvertTemp{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

double temp;
String unit;
double newTemp;

System.out.print("Enter the Temperature: ");
temp = input.nextDouble();

System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
unit = input.next().toUpperCase();

newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

System.out.printf("%.1f%s", newTemp, unit);

input.close();

}

}