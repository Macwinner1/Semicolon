public class BarChart{
public static void main(String[] args){
int[] array = {6, 8, 15, 25, 35, 84, 50, 40, 43, 30, 20};
System.out.println("Grade distribution:");
for(int counter = 0; counter < array.length; counter++){
if(counter == 10){
System.out.printf("%5d: ", 100);
}
else {
System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);
}

for(int stars = 0; stars < array[counter]; stars++){
System.out.print("*");
}

System.out.println();
}



}


}