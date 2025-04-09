public class DivisibleByThree{
public static void main(String[] args){

int sum = 0;

for(int counter = 1; counter <= 30; counter++){
int number = counter;

if(number % 3 == 0){
System.out.println("number: " + number);

sum += number;
}
}



System.out.print("This is the total of all number Divisible by 3: " + sum);



}


}