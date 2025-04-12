import java.util.Scanner;
public class TaxCalculator{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Kindly Enter Citizen name: ");
String Nam1 = input.next();
System.out.println("Kindly Enter Citizen Earning: ");
int earn1 = input.nextInt();
System.out.println("Kindly Enter Citizen name: ");
String Nam2 = input.next();
System.out.println("Kindly Enter Citizen Earning: ");
int earn2 = input.nextInt();
System.out.println("Kindly Enter Citizen name: ");
String Nam3 = input.next();
System.out.println("Kindly Enter Citizen Earning: ");
int earn3 = input.nextInt();

if(earn1 <= 30000){
double Tax = earn1 * (15.0 / 100);
System.out.printf("%n%nCitizen Name :" + Nam1 + "%nEarning :" + earn1 + "%nTax rate :" + Tax);
}
if (earn1 > 30000){
double Tax = earn1 * (20.0 / 100);
System.out.printf("%n%nCitizen Name :" + Nam1 + "%nEarning :" + earn1 + "%nTax rate :" + Tax);
}
if(earn2 <= 30000){
double Tax = earn2 * (15.0 / 100);
System.out.printf("%n%nCitizen Name :" + Nam2 + "%nEarning :" + earn2 + "%nTax rate :" + Tax);
}
if(earn2 > 30000){
double Tax = earn2 * (20.0 / 100);
System.out.printf("%n%nCitizen Name :" + Nam2 + "%nEarning :" + earn2 + "%nTax rate :" + Tax);
}
if(earn3 <= 30000){
double Tax = earn3 * (15.0 / 100);
System.out.printf("%n%nCitizen Name :" + Nam3 + "%nEarning :" + earn3 + "%nTax rate :" + Tax);
}
if(earn3 > 30000){
double Tax = earn3 * (20.0 / 100);
System.out.printf("%n%nCitizen Name :" + Nam3 + "%nEarning :" + earn3 + "%nTax rate :" + Tax);
}
}
}