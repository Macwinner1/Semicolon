public class SumOfASeries{
public static void main(String[] args){

long number = 1;
long sum = 0;

System.out.printf("%-10s%-10s%n", "Value", "Total");

while(number <= 100){
sum += number;
System.out.printf("%-10d%-10d%n", number, sum);

number++;
}


}


}