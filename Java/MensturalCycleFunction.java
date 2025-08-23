public class MensturalCycleFunction {

public void appMenu() {
System.out.println("""
Welcome to My-Cycle app =><=!
This app can help you ==:
<(1)> Estimate your cycle length:
	 //i.e\\ (|~ Know the estimated day your next cycle starts. ~|)
	 //i.e\\ (|~ For accuracy get the length of 6 consecutive menstural cycles. ~|)
<(2)> What happens from |/starting-cycle <day1> ~ restarting-cycle <day1>\|:
	 //i.e\\ (|~ Know your Menstural Phase. ~|)
 	 //i.e\\ (|~ Know your Follicular Phase. ~|)					
 	 //i.e\\ (|~ Know your Ovulation Day. ~|)	
 	 //i.e\\ (|~ Know your Luteal Phase. ~|)
 	 //i.e\\ (|~ Know your Safe period. ~|)
 	 //i.e\\ (|~ Know the estimated day your next period starts. ~|)
<(3)> Know your estimated cycle length: 
""");
}

public static int[][] calenderArray() {
int[][] calenderArray2025 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
return calenderArray2025;
}

public static void loginDay() {
System.out.println("Enter day of login");
}

public static void loginMonth() {
System.out.println("Enter number <1 - 12> = (jan-dec) to get month of login. ");
}


public static void lastCycleStartDay() {
System.out.println("""
Enter the day of the month you started your last cycle: 
 	 //i.e\\ (|~ If you want to get more accuracy, enter the last previous cycle start days. ~|)
 	 //i.e\\ (|~ If you want to enter previous days enter consecutively in reverse. ~|)
 	 //i.e\\ (|~ Enter two previous cycle starting days minimum and six cycle starting days maximum for accurate estimate ~|)
""");
}

public static void lastCycleStartMonth() {
System.out.prinln("""
Enter number <1 - 12> = (jan-dec) to get the month in 2025 you started your last cycle: 
 	 //i.e\\ (|~ If you want to get more accuracy, enter the last previous cycle start days. ~|)
 	 //i.e\\ (|~ If you want to enter previous days enter consecutively in reverse. ~|)
 	 //i.e\\ (|~ Enter two previous cycle starting days minimum and six cycle starting days maximum for accurate estimate ~|)
""");
}

public static int calculateCycleLength(int[][] calenderArray, int month, int day) {
int remainingDays = 0
for (int index = 0; index < calenderArray.length; index++) {
if (month == calenderArray[index - 1]) {
remainingDays += (calenderArray[index - 1] - day);
} 
}
return remainingDays;
}


polycystic ovary syndrom - its a common hormonal disorder in women of reproductive age that causes hormonal inbalance leadiding to syntoms like irregular period, excess androgens(male hormones) and ovarian cyst
}