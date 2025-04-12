import java.util.Scanner;
public class NumberSpace{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter any five numbers");
int numb = input.nextInt();
if(numb < 10000 || numb > 99999){
System.out.println("Kindly input a vaild number");
}
else{
int a = numb % 10;
numb = numb / 10;
int b = numb % 10;
numb = numb / 10;
int c = numb % 10;
numb = numb / 10;
int d = numb % 10;
numb = numb / 10;
int e = numb % 10;
System.out.println(e+ " " +d+ " " +c+ " " +b+ " " +a);
}
input.close();
}
}