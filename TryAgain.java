import java.util.Random;
public class TryAgain{
public static void main(String[] args){

Random random = new Random();

boolean isHead = random.nextBoolean();

if(isHead){
System.out.print("HEAD");
}
else{
System.out.print("TAIL");
}


}

}