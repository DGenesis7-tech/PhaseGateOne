public class CreditCardValidationFunctions {

public static int sumEvenPositions(String input, int sumEven) {
	for (int index = input.length() - 2; index >= 0 ; index -= 2) {
		if ((input.charAt(index) - '0') < 5) {
		sumEven += (input.charAt(index) - '0') * 2;
		}  
		else {
		int firstDigit = ((input.charAt(index) - '0') * 2) / 10;
		int secondDigit = ((input.charAt(index) - '0') * 2) % 10;
		sumEven += (firstDigit + secondDigit); 
		}
	}
return sumEven;	
}

public static int sumOddPositions(String input, int sumOdd) {
	for (int index = input.length() - 1; index >= 0 ; index -= 2) {
		if ((input.charAt(index) - '0') < 5) {
		sumOdd += (input.charAt(index) - '0') * 2;
		}  
		else {
		int firstDigit = ((input.charAt(index) - '0') * 2) / 10;
		int secondDigit = ((input.charAt(index) - '0') * 2) % 10;
		sumOdd += (firstDigit + secondDigit); 
		}
	}
return sumOdd;
}

public static void cardStatus(String number, int total) {
String cardType = "";
		if (total % 10 == 0) {
			if ((number.charAt(0) - '0') == 4) {
			cardType = "Visa card";
			System.out.println("********************************************");
			System.out.println("**Credit Card Type: " + cardType);
			System.out.println("**Credit Card Number: " + number);
			System.out.println("**Credit Card Digit: " + number.length());
			System.out.println("**Credit Card Validity Status: Valid");
			System.out.println("********************************************");
			} 
			else if ((number.charAt(0) - '0') == 5) {
			cardType = "Master card";
			System.out.println("********************************************");
			System.out.println("**Credit Card Type: " + cardType);
			System.out.println("**Credit Card Number: " + number);
			System.out.println("**Credit Card Digit: " + number.length());
			System.out.println("**Credit Card Validity Status: Valid");
			System.out.println("********************************************");
			}
			else if ((number.charAt(0) - '0') == 3 && (number.charAt(1) - '0') == 7) {
			cardType = "American Express card";
			System.out.println("********************************************");
			System.out.println("**Credit Card Type: " + cardType);
			System.out.println("**Credit Card Number: " + number);
			System.out.println("**Credit Card Digit: " + number.length());
			System.out.println("**Credit Card Validity Status: Valid");
			System.out.println("********************************************");
			}
			else if ((number.charAt(0) - '0') == 6) {
			cardType = "Discover card";
			System.out.println("********************************************");
			System.out.println("**Credit Card Type: " + cardType);
			System.out.println("**Credit Card Number: " + number);
			System.out.println("**Credit Card Digit: " + number.length());
			System.out.println("**Credit Card Validity Status: Valid");
			System.out.println("********************************************");
			}
			else {
			cardType = "Invalid card";
			System.out.println("********************************************");
			System.out.println("**Credit Card Type: " + cardType);
			System.out.println("**Credit Card Number: " + number);
			System.out.println("**Credit Card Digit: " + number.length());
			System.out.println("**Credit Card Validity Status: Invalid");
			System.out.println("********************************************");
			}
		}	
		else {
			if ((number.charAt(0) - '0') == 4) {
			cardType = "Visa card";
			System.out.println("********************************************");
			System.out.println("**Credit Card Type: " + cardType);
			System.out.println("**Credit Card Number: " + number);
			System.out.println("**Credit Card Digit: " + number.length());
			System.out.println("**Credit Card Validity Status: Invalid");
			System.out.println("********************************************");
			} 
			else if ((number.charAt(0) - '0') == 5) {
			cardType = "Master card";
			System.out.println("********************************************");			
			System.out.println("**Credit Card Type: " + cardType);
			System.out.println("**Credit Card Number: " + number);
			System.out.println("**Credit Card Digit: " + number.length());
			System.out.println("**Credit Card Validity Status: Invalid");
			System.out.println("********************************************");			
			}
			else if ((number.charAt(0) - '0') == 3 && (number.charAt(1) - '0') == 7) {
			cardType = "American Express card";
			System.out.println("********************************************");			
			System.out.println("**Credit Card Type: " + cardType);
			System.out.println("**Credit Card Number: " + number);
			System.out.println("**Credit Card Digit: " + number.length());
			System.out.println("**Credit Card Validity Status: Invalid");
			System.out.println("********************************************");			
			}
			else if ((number.charAt(0) - '0') == 6) {
			cardType = "Discover card";
			System.out.println("********************************************");			
			System.out.println("**Credit Card Type: " + cardType);
			System.out.println("**Credit Card Number: " + number);
			System.out.println("**Credit Card Digit: " + number.length());
			System.out.println("**Credit Card Validity Status: Valid");
			System.out.println("********************************************");			
			}
			else {
			cardType = "Invalid card";
			System.out.println("********************************************");			
			System.out.println("**Credit Card Type: " + cardType);
			System.out.println("**Credit Card Number: " + number);
			System.out.println("**Credit Card Digit: " + number.length());
			System.out.println("**Credit Card Validity Status: Invalid");
			System.out.println("********************************************");			
			}
		}
}	








}