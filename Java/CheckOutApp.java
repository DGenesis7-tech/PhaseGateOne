import java.util.Scanner;
public class CreditCardValidation {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
String[] itemsArray = new String[10];
int[] itemsCountArray = new int[10];
double[] itemPricesArray = new double[10];
double[] totalArray = new double[10];
String reply = "";

System.out.println("What is the customer's name");
String customerName = input.nextLine();

do {
Int index = 0;
System.out.println("What did the customer buy?");
itemsArray[index] = input.next();

System.out.println("How many pieces?");
itemsCountArray[index] = input.nextInt();

System.out.println("How much per unit?");
itemPricesArray[index] = input.nextDouble();

totalArray[index] = itemPricesArray[index] * itemsCountArray[index];

index += 1;
System.out.println("Add more item");
reply = input.next().toLowerCase();

} while (reply != "no");
System.out.println("What is your name");
String cashiersName = input.nextLine();
System.out.println("How much discount will he get");
int discount = input.nextInt();

System.out.println("SEMICOLON STORES");
System.out.println("MAIN BRANCH");
System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
System.out.println("TEL: 07031032739");
System.out.println("DATE: ");
System.out.println("Cashier: " + cashiersName);
System.out.println("Customer's name: " + customerName);
System.out.println("=======================================================");
System.out.println("                ITEM	  QTY	    PRICE		 TOTAL(NGN)");
System.out.println("-------------------------------------------------------");
System.out.println("           " + itemsArray[0] + "     " + itemsCountArray[0] + "     " + itemPricesArray[0] + "		  " + totalArray[0]);
System.out.println("           " + itemsArray[1] + "     " + itemsCountArray[1] + "     " + itemPricesArray[1] + "		  " + totalArray[1]);


}
}