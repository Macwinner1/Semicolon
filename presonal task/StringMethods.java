public class StringMethods{
public static void main(String[] args){

String name = "Mac winner";
/*
int length = name.length();
char letter = name.charAt(2);
int index = name.indexOf(" ");
int lastIndex = name.lastIndexOf("n");

name = name.toUpperCase();
name = name.toLowerCase();

if(name.contains(" ")){
System.out.print("Your name contains space");
}
else{ 
System.out.print("Hello " + name);
}

*/

if(name.isEqualIgnoreCase("mac winner")){
System.out.print("You cant use same name for password");
}
else{ 
System.out.print("Hello " + name);
}

System.out.print(name);

}

}