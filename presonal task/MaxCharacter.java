public class MaxCharacter{
public static void main(String[] args){

int max = -1;
String name = "abyyyy";
char C = ' ';

int[] arr = new int[127];

for(int i = 0; i < name.length()-1; i++){

arr[name.charAt(i)] = arr[name.charAt(i)] + 1;
}

for(int i = 0; i < name.length()-1; i++){
if(max < arr[name.charAt(i)]){
max = arr[name.charAt(i)];
C = name.charAt(i);

}
 

}
System.out.print(C);

}


}