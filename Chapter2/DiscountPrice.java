public class DiscountPrice{
public static void main(String[] args){

boolean isStudent = true;
boolean isSenior = false;
double price = 9.99;

if(isStudent){
if(isSenior){
System.out.print("Aww you just got a Student Discount! of 10% \n");
System.out.print("Aww you just got a Senior Discount! of 20% \n");
price *= 0.7;
}
else{
System.out.print("Aww you just got a Student Discount! of 10% \n");
price *= 0.9;
}
}
else{
if(isSenior){
System.out.print("Aww you just got a Senior Discount! of 20% \n");
price *= 0.8;
}
else{
price *= 1;
}

}
System.out.printf("The price of a ticket is: $%.2f\n", price);

}

}