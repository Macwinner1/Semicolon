import java.util.Scanner;
public class Properly{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

int product = 1;
int c = 1;

while(c <= 5){
System.out.print("Enter 1 for Woman and 2 for Man : ");
product *= c;
int gender = input.nextInt();

if(gender == 1){
System.out.println("Woman");
}
else
{
System.out.println("Man");
}

++c;
}
System.out.println(product);


}


}
