public class CheckerBoard{
public static void main(String[] args){

for(int i = 1; i < 9; i++){

if(i >= 2){
for(int j = 2; j <= 1; j+=2){
System.out.print(" ");
}
}

for(int k = 1; k <= 8; k++){
System.out.print("*");
}


System.out.println();
}

}


}