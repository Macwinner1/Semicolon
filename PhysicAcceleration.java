import java.util.Scanner;

public class PhysicAcceleration{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the starting Velocity in meters/second :");
double startVelocity = input.nextDouble();

System.out.print("Enter the ending Velocity in meters/second :");
double endVelocity = input.nextDouble();

System.out.print("Enter the time span in meters/second :");
double spanTime = input.nextDouble();

double totalAcceleration = (startVelocity - endVelocity) / spanTime;

System.out.printf("The average acceleration is: %.4f", totalAcceleration);

}


}