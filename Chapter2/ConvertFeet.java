import java.util.Scanner;

public class ConvertFeet{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a value for feet: ");
double numberFeet = input.nextDouble();

double meters = numberFeet * 0.305; 

System.out.printf("%.1f feet is %.4f meters", numberFeet, meters);
}

}