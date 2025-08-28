import java.util.Scanner;
import java.time.LocalDateTime;
public class CheckOutApp {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
LocalDateTime currentTime = LocalDateTime.now();
CheckOutAppFunctions object = new CheckOutAppFunctions();

String[] itemsArray = new String[10];
int[] itemsCountArray = new int[10];
double[] itemPricesArray = new double[10];
double[] totalArray = new double[10];
double subTotal = 0;
double discountPrice = 0;
int index = 0;
String reply = "";

System.out.println("What is the customer's name");
String customerName = input.nextLine();

do {
System.out.println("What did the customer buy?");
itemsArray[index] = input.next();

System.out.println("How many pieces?");
itemsCountArray[index] = input.nextInt();

System.out.println("How much per unit?");
itemPricesArray[index] = input.nextDouble();

totalArray[index] = itemPricesArray[index] * itemsCountArray[index];
subTotal += totalArray[index];
index += 1;
System.out.println("Add more item");
reply = input.next().toLowerCase();

} while (!reply.equals("no"));
System.out.println();
input.nextLine();

System.out.println("What is your name");
String cashiersName = input.nextLine();

System.out.println("How much discount will he get");
int discountPct = input.nextInt();
discountPrice = (discountPct / 100.0) * subTotal;
double vat = (17.50 / 100.00) * subTotal;
double billTotal = (subTotal - discountPrice) + vat;

object.outputMessageOne();
System.out.println("DATE: " + currentTime);
object.namesOutput(cashiersName, customerName);
object.arraysOutput(index, itemsArray, itemsCountArray, itemPricesArray, totalArray);
System.out.println("                        Sub Total:          " + subTotal);
System.out.println("                         Discount:          " + discountPrice);
System.out.println("                     VAT @ 17.50%:          " + vat);
System.out.println("=======================================================");
System.out.println("                       Bill Total:          " + billTotal);
System.out.println("=======================================================");
System.out.println("THIS IS NOT A RECEIPT KINDLY PAY " + billTotal);
System.out.println("=======================================================");
System.out.println();
System.out.println("How much did your custumer give to you");
double payment = input.nextDouble();
double balance = payment - billTotal;
System.out.println();

if (balance > 0) {
object.outputMessageOne();
System.out.println("DATE: " + currentTime);
object.namesOutput(cashiersName, customerName);
System.out.println("=======================================================");
System.out.println("               ITEM	 QTY	  PRICE	  TOTAL(NGN)");
System.out.println("-------------------------------------------------------");
System.out.println("               " + itemsArray[0] + "    " + itemsCountArray[0] + "     " + itemPricesArray[0] + "	    " + totalArray[0]);
System.out.println("               " + itemsArray[1] + "       " + itemsCountArray[1] + "     " + itemPricesArray[1] + "       " + totalArray[1]);
System.out.println("                        Sub Total:          " + subTotal);
System.out.println("                         Discount:          " + discountPrice);
System.out.println("                     VAT @ 17.50%:          " + vat);
System.out.println("=======================================================");
System.out.println("                       Bill Total:          " + billTotal);
System.out.println("                      Amount paid:          " + payment);
System.out.println("                          Balance:          " + balance);
System.out.println("=======================================================");
System.out.println("THANK YOU FOR YOUR PATRONAGE");
System.out.println("=======================================================");
}
else {
System.out.println("PAYMENT DECLINED!!!. NOT UP TO BILL");
}

}
}