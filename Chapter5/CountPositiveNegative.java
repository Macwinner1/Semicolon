import java.util.Scanner;
public class CountPositiveNegative{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

double total = 0;
double average = 0;
int negative = 0;
int positive = 0;
double count = 1;
double number = 0;


System.out.print("Enter any number: ");
while(count > 0){
number = input.nextDouble();

total+= number;

if(number < 0){
negative++;
}

if(number > 0){
positive++;
}
if(number == 0){
break;
}

average = (double) total / count;
count++;
}


System.out.printf("The number of positives is %d%n", negative);
System.out.printf("The number of positives is %d%n", positive);
System.out.printf("The total is %.1f%n", total);
System.out.printf("The average is %.2f%n", average);


}


}