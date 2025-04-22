import java.util.Scanner;

public class OccurrenceOfMax{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int max = 0;
int count = 1;
int sentiel = -1;
int number;
int result = 0;

System.out.print("Enter numbers: ");
number = input.nextInt();

while(number != sentiel){


if(number > max){
max = number;
count = 1;
result += count;
}
number = input.nextInt();

}

System.out.println("this is the largest number: " + max);
System.out.println("this is the number of Occurrence: " + result);
}

}