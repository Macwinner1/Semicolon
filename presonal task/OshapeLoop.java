public class OshapeLoop{
public static void main(String[] args){

for(int i = 1; i <= 9; i++){

for(int j = 1; j <= 9; j++){
if(i >= 3 && j >= 3 && i <= 7 && j<= 7){
System.out.print(" ");
}
else{
System.out.print("*");
}

}

System.out.println();
}



}
}