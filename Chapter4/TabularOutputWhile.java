public class TabularOutputWhile{
public static void main(String[] args){
int count = 1;
System.out.printf("%-10s%-10s%-10s%-10s\n", "N", "N^2", "N^3", "N^4");

while(count <= 5){

int number2 = count * count;
int number3 = count * count * count;
int number4 = count * count * count * count;
int number5 = count * count * count * count * count;


System.out.printf("%-10d%-10d%-10d%-10d\n", count, number2, number3, number4, number5);
count ++;
}


}

}