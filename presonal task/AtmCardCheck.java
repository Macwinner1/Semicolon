public class AtmCardCheck{

public static String cardChecker(int[] numbers){
String cardAmericanExpress = "{card:Vaild, issuer:"American Express"}";
if(numbers.length == 15 && numbers[0] == 3)

return cardAmericanExpress;
}

}