public class AtmCardCheck{

public static int[] cardChecker(int[] numbers){

if(numbers.length == 15 && numbers[0] == 3){
return {card: Vaild, issuer : "American Express"};
}
else if(numbers.length == 16 && numbers[0] == 4){
return {card: Vaild, issuer : "Visa"};
}
else if(numbers.length == 16 && numbers[0] == 5){
return {card: Vaild, issuer : "Mastercard"};
}
else if(numbers.length == 16 && numbers[0] == 6){
return {card: Vaild, issuer : "Discover"};
}
else{
return {{card: Invaild, reason : ""};};
}

}

}