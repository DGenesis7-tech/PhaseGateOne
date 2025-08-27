import java.util.Scanner;
public class CreditCardValidation {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
CreditCardValidationFunctions object = new CreditCardValidationFunctions();
int sumEven = 0;
int sumOdd = 0;
int total = 0;

System.out.println("Hello, Kindly enter your card details to verify");
String cardNumber = input.next(); 
if (cardNumber.length() >= 13 && cardNumber.length() <= 16) { 
	sumEven = object.sumEvenPositions(cardNumber, sumEven);
	sumOdd = object.sumOddPositions(cardNumber, sumOdd);
	
	total = sumEven + sumOdd;
System.out.println(total); 
	object.cardStatus(cardNumber, total);						
}
else {
System.out.println("Invalid card. Card length out of range!!!."); 
}
}


}