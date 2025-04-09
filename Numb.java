import java.util.Scanner;
public class Numb{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter any number :");
int numb = input.nextInt();
if(numb % 3 == 0){
System.out.print("This number is divided by 3: " + numb);
}
else{
System.out.print("This number is not dividisble by 3: " + numb);
}
}
}