import java.util.Scanner;

public class NewPrimeNumber{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number to see range of prime numbers: ");
int number = input.nextInt();
int count = 0;

for(int out = 2; out <= number; out++){
count = 0;
for(int in = 1; in <= number; in++){

if(out % in == 0){
count++;
}
}
if(count == 2){
System.out.println("these are the prime number: " + out);
}

else{
System.out.println("this is not prime number: " + out);
}
}




}


}