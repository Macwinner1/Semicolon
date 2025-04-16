import java.util.Scanner;

public class NumberWordGame{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

int number1 = 1;
int number2 = 2;
int number3 = 3;
int number4 = 4;
int number5 = 5;
int number6 = 6;
int number7 = 7;
int number8 = 8;
int number9 = 9;
int number10 = 10;

System.out.print("Enter numbers from 1 - 10 and get it back in words:  ");
int number = input.nextInt();

if(number == number1){
System.out.print("One");
}
else if(number == number2){
System.out.print("Two");
}
else if(number == number3){
System.out.print("Three");
}
else if(number == number4){
System.out.print("Four");
}
else if(number == number5){
System.out.print("Five");
}
else if(number == number6){
System.out.print("Six");
}
else if(number == number7){
System.out.print("Seven");
}
else if(number == number8){
System.out.print("Eight");
}
else if(number == number9){
System.out.print("Nine");
}
else if(number == number10){
System.out.print("Ten");
}

else{
System.out.print("kindly input another number ");
}



}

}