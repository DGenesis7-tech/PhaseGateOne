import java.util.Scanner;
public class MensturalCycleApp {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
MensturalCycleFunction object = new MensturalCycleFunction();
int[] cycleLengthArray = new int[6]; 
int[] calenderArray2025 = object.calenderArray();
int select = 0;
int loginDay = 0;
int loginMonth = 0;
int cycleLength = 0;
int cycleCount = 0;
double average = 0;

while (select != 4) {

	object.appMenu();
	select = input.nextInt();

	switch (select) {
		case 1:
		object.lastCycleLength();
		cycleLength = input.nextInt();
		object.cycleLengthArray(cycleLengthArray, cycleCount, cycleLength);
		if (cycleCount >= 1){ 
		average = object.averageCycleLength(cycleLengthArray, cycleCount);
		} else {
		System.out.println("Enter another cycle length. i.e The previous length before your current input ");		
		}
		cycleCount += 1;
		break;
		case 2:
		object.messageForCycyleLength(average);
		break;
		case 3:
		System.out.println(average);
		break;
		case 4:
		System.out.println("Bye..!!");
		default:
		System.out.println("Incorrect input..!!");
	}

}


}



}