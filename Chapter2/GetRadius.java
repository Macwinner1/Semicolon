import java.util.Scanner;

public class GetRadius{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

double radius;
double circumference;
double area;
double volume;

System.out.print("Kindly input your radius: ");
radius = input.nextDouble();

circumference = 2 * Math.PI * radius;
area = Math.PI * Math.pow(radius, 2);
volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);


System.out.printf("This is Circumference: %.4f%n", circumference);
System.out.printf("This is Area: %.4f%n", area);
System.out.printf("This is Volume: %.4f%n", volume);

input.close();
}


}