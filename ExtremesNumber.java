import java.util.Scanner;
public class ExtremesNumber{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter how many values will you want to input: ");
int collect = input.nextInt();

int sum = 0;
int newNumber = 0;
int smallestNumber = 0;
int largestNumber = 0;

System.out.println("kindly Enter new value: ");
smallestNumber = newNumber;

for(int i = 1; i <= collect; ++i){
newNumber = input.nextInt();

if(newNumber <= smallestNumber){
smallestNumber = newNumber;
}
else if (newNumber >= smallestNumber){
largestNumber = newNumber;
}
else if(newNumber <= smallestNumber){
smallestNumber = newNumber;
}
else if (newNumber >= smallestNumber){
largestNumber = newNumber;
}

else if(newNumber <= smallestNumber){
smallestNumber = newNumber;
}
else if (newNumber >= smallestNumber){
largestNumber = newNumber;
}

else if(newNumber <= smallestNumber){
smallestNumber = newNumber;
}
else if (newNumber >= smallestNumber){
largestNumber = newNumber;
}

}
sum = smallestNumber + largestNumber;

System.out.println("This is your smallest number: " + smallestNumber);
System.out.println("This is your largest number: " + largestNumber);
System.out.println("this is the sum of my largest and smallest number: " + sum);


}//method


}//class