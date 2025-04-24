
import java.util.Scanner;

public class HighestSecondScore{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

int largest = 0;
int count = 1;
String name = " ";
String secondName = " ";
int secondLargest = 0;

System.out.println("Enter the number of Students: ");
int studentNumber = input.nextInt();

for(; count <= studentNumber; count++){

System.out.println("Enter the Student Score: ");
int studentScore = input.nextInt();

if(studentScore == largest){
secondLargest = largest;
largest = studentScore;
}

if(studentScore > largest){
secondLargest = largest;
largest = studentScore;
}


System.out.println("Enter the Student name: ");
String studentName = input.next();

if(studentScore == largest){
secondName = name;
name = studentName;
}

if(studentScore > largest){
secondName = name;
name = studentName;
}


}

System.out.println("This is the student name:" + name);
System.out.println("This is the highest score:" + largest);

System.out.println("This is the student name:" + secondName);
System.out.println("This is the Second highest score:" + secondLargest);

}

}