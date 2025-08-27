

public class CreditCard {
public static void main(String[] args) {
CreditCardValidationFunctions object = new CreditCardValidationFunctions();
String[] array1 = new String[16];
String[] array2 = new String[15];
String[] array3 = new String[14];
String[] array4 = new String[13];
int index = 0;
int sumEven = 0;
int sumOdd = 0;
int total = 0;
String cardType = "";

String number = "4388576018402626";
if (number.length() == 16) { 
	object.sumEvenPositions(number, sumEven);
	object.sumOddPositions(number, sumOdd);
	
	total += sumEven + sumOdd;
	object.cardStatus(number, total);						
}

}


}