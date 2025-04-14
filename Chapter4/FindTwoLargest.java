import java.util.Scanner;

public class FindTwoLargest{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter 10 numbers to find largest and 2nd largest: ");
int count = 1;
int largest = 0;
int secondLargest = 0;

while(count <= 10){
int number = input.nextInt();

if(number >= largest){
secondLargest = largest;
largest = number;
}

if(largest > number && number < secondLargest){
secondLargest = number;
}

if(secondLargest < number && largest > number){
secondLargest = number;
}



count++;
}

System.out.print("This is the largest number: " + largest);
System.out.print("This is the Second Largest number: " + secondLargest);



}

}