import java.util.Scanner;
public class MensturalCycleApp {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
MensturalCycleFunction object = new MensturalCycleFunction();
ArrayList<String> cycleDaysList = new ArrayList<>();

int cycleCount = 0;
int select = 0;
while (select != 3) {
	object.appMenu();
	select = input.nextInt();
	switch (select) {
		case 1:
		object.cycleStartPrompt();
		int days = input.nextInt();
		int length = object.calculateCycleLength(day);
		System.out.println("Your extimted cycle length is : " + length + "days");
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