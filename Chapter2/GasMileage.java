import java.util.Scanner;
public class GasMileage{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

double mileageCounter = 1;
double TotalMilesDriven = 0;
double TotalGallonUsed = 0;
double milePerGallon = 0;
double totalMilesPerGallon =0;

while(mileageCounter <= 4){
System.out.print("Enter the Miles Driven : ");
double MilesDriven = input.nextDouble();
System.out.print("Enter Gallon Used :");
double GallonUsed = input.nextDouble();

milePerGallon = MilesDriven / GallonUsed;

TotalMilesDriven += MilesDriven;
TotalGallonUsed += GallonUsed;

totalMilesPerGallon = TotalMilesDriven / TotalGallonUsed;


mileageCounter++;
}
System.out.printf("This is Mileage Per Gallon :%.4f%n", milePerGallon);
System.out.printf("This is Total MPG :%.4f%n", totalMilesPerGallon);

}
}