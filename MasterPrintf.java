public class MasterPrintf{
public static void main(String[] args){

String name = "Okafor";
int age = 32;
double height = 6.5;
boolean isSingle = true;

int id1 = 1;
int id2 = 23;
int id3 = 345;
int id4 = 4567;

System.out.print("My name is: " + name);
System.out.print(" " + "I'm " + age + " " + "years old");
System.out.print(" " + "My height is: " + height);
if(isSingle){
System.out.print(" " + "are you single: Yes!");
}
else{
System.out.print(" " + "are you single: No!");
}

System.out.printf("%nMy name is: %s i'm %d Years old my height is: %.1f are you single: %b\n", name, age, height, isSingle);


System.out.printf("%4d\n", id1);
System.out.printf("%4d\n", id2);
System.out.printf("%4d\n", id3);
System.out.printf("%4d\n\n", id4);


System.out.printf("%-4d\n", id1);
System.out.printf("%-4d\n", id2);
System.out.printf("%-4d\n", id3);
System.out.printf("%-4d\n\n", id4);

System.out.printf("% 4d\n", id1);
System.out.printf("% 4d\n", id2);
System.out.printf("% 4d\n", id3);
System.out.printf("% 4d\n\n", id4);

System.out.printf("%04d\n", id1);
System.out.printf("%04d\n", id2);
System.out.printf("%04d\n", id3);
System.out.printf("%04d\n", id4);


}

}