public class SecondLargestArray{

public static void main(String[] args){

int[] numbers = {20, 15, 6, 14, 1};

int secondLarge = numbers[0];
int largest = 0;

for(int index = 0; index < numbers.length; index++){

for(int item = index; item < numbers.length; item++){
	if(numbers[index] > largest){
	secondLarge = largest;
	largest = numbers[index];
	}
	else if(numbers[index] < largest && numbers[index] > secondLarge){
	secondLarge = numbers[index];
	}
}

}

System.out.print("This is the 2nd largest number: " + secondLarge);
}
}
