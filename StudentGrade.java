import java.util.Scanner;

public class StudentGrade{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Kindly Enter Student Name : ");
String name = input.nextLine();
int gradeA = 0;
int gradeB = 0;
int gradeC = 0;
int gradeD = 0;
int gradeF = 0;

int English = 0;
int Maths = 0;
int physic = 0;
int chemistry = 0;
int biology = 0;
int history = 0;
int government = 0;
int igbo = 0;

int studentCounter = 1;

while(studentCounter >= 10){
int subjectCounter = 1;

while(subjectCounter >= 8){
System.out.println("Enter Subject score (Eng 1, math 2, phy 3, chem 4, bio 5, his 6, gov 7, 1gbo 8) : ");
int studentGrade = input.nextInt();

if(studentGrade >= 80 && studentGrade <= 100){
gradeA = gradeA + 1;
}
if(studentGrade >= 65 && studentGrade <= 79){
gradeB = gradeB + 1;
}
if(studentGrade >= 50 && studentGrade <= 64){
gradeC = gradeC + 1;
}
if(studentGrade >= 40 && studentGrade <= 49){
gradeD = gradeD + 1;
}
else{
gradeF = gradeF + 1;
}

subjectCounter = subjectCounter + 1;
}//2nd while loop


studentCounter = studentCounter + 1;
System.out.printf("Name :%nGrade\"A\" :%nGrade\"B\" :%nGrade\"C\" :%nGrade\"D\" :%nGrade\"F\" : " name, gradeA, gradeB, gradeC, gradeD, gradeF);
}//close while loop



}//close method   
}//close class