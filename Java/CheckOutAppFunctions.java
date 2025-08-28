public class CheckOutAppFunctions {

public static void outputMessageOne() {
System.out.println();
System.out.println("SEMICOLON STORES");
System.out.println("MAIN BRANCH");
System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
System.out.println("TEL: 07031032739");
}

public static void namesOutput(String nameOne, String nameTwo) {
System.out.println("Cashier: " + nameOne);
System.out.println("Customer's name: " + nameTwo);
}

public static void arraysOutput(int index, String[] itemsArray, int[] itemsCountArray, double[] itemPricesArray, double[] totalArray) {
System.out.println("=======================================================");
System.out.println("               ITEM	 QTY	  PRICE	  TOTAL(NGN)");
System.out.println("-------------------------------------------------------");
if (index == 4) {
System.out.println("             " + itemsArray[0] + "      " + itemsCountArray[0] + "     " + itemPricesArray[0] + "	    " + totalArray[0]);
System.out.println("               " + itemsArray[1] + "        " + itemsCountArray[1] + "     " + itemPricesArray[1] + "       " + totalArray[1]);
System.out.println("               " + itemsArray[2] + "        " + itemsCountArray[2] + "     " + itemPricesArray[2] + "       " + totalArray[2]);
System.out.println("               " + itemsArray[3] + "        " + itemsCountArray[3] + "     " + itemPricesArray[3] + "       " + totalArray[3]);
}
else if (index == 3) {
System.out.println("             " + itemsArray[0] + "      " + itemsCountArray[0] + "     " + itemPricesArray[0] + "	    " + totalArray[0]);
System.out.println("               " + itemsArray[1] + "        " + itemsCountArray[1] + "     " + itemPricesArray[1] + "       " + totalArray[1]);
System.out.println("               " + itemsArray[2] + "        " + itemsCountArray[2] + "     " + itemPricesArray[2] + "       " + totalArray[2]);
}
else if (index == 2) {
System.out.println("             " + itemsArray[0] + "      " + itemsCountArray[0] + "     " + itemPricesArray[0] + "	    " + totalArray[0]);
System.out.println("               " + itemsArray[1] + "        " + itemsCountArray[1] + "     " + itemPricesArray[1] + "       " + totalArray[1]);
}
else if (index == 1) {
System.out.println("             " + itemsArray[0] + "      " + itemsCountArray[0] + "     " + itemPricesArray[0] + "	    " + totalArray[0]);
}
else {
System.out.println("Empty Cart!!!");
}
}













}