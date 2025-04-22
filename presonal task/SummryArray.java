public class SummryArray{
public static void main(String[] args){

int[] array = {37, 23, 45, 32, 56, 76, 43, 69, 90, 82};
int total = 0;

for(int counter = 0; counter < array.length; counter++){
total += array[counter];
}
System.out.print("Total of array element :" + total );
}


}