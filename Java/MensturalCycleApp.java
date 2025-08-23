import java.util.Scanner;
public class MensturalCycleApp {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
MensturalCycleFunction object = new MensturalCycleFunction();
int[][] cycleDayAndMonthArray = new cycleDayAndMonthArray [6][2]; 
int[] calenderArray2025 = new calenderArray2025[12];
int select = 0;
int loginDay = 0;
int loginMonth = 0;
int month = 0;
int day = 0;
while (select != 4) {

	object.appMenu();
	select = input.nextInt();
	object.loginDay();
	loginDay = input.nextInt();
	object.loginMonth();
	loginMonth = input.nextInt();

	switch (select) {
		case 1:
		object.lastCycleStartMonth();
		month = input.nextInt();
		object.lastCycleStartDay();
		day = input.nextInt();
		if 

		int length = object.calculateCycleLength(day);
		System.out.println("Your extimated cycle length is : " + length + "days");
		break;
		case 2:
		if (count <= 1){
		System.out.print("""
		<day1> ~ <day5> : |Menstural Phase| : '`Menstural bleeding occurs in this phase`' ");
		<day6> ~ <day14> : |Follicular Phase| : '`In this stage an egg matures in preparation for ovulation, and the uterine lining starts to thickens`' 
		
		}
		


	}
cycleDaysList.add(length);
cycleCount += 1;
}


}



}