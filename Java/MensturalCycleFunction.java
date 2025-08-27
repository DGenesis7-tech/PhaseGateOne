public class MensturalCycleFunction {

public void appMenu() {
System.out.println("""
Welcome to My-Cycle app =><=!
This app can help you with the following options. Select from options <1 - 4> ==:
<(1)> Estimate your cycle length:
	 //i.e\\ (|~ Know the estimated day your next cycle starts. ~|)
	 //i.e\\ (|~ For accuracy get the length of 6 consecutive menstural cycles. ~|)
<(2)> What happens from starting-cycle <day1> ~ restarting-cycle <day1>:
	 //i.e\\ (|~ Know your Menstural Phase. ~|)
 	 //i.e\\ (|~ Know your Follicular Phase. ~|)					
 	 //i.e\\ (|~ Know your Ovulation Day. ~|)	
 	 //i.e\\ (|~ Know your Luteal Phase. ~|)
 	 //i.e\\ (|~ Know your Safe period. ~|)
 	 //i.e\\ (|~ Know the estimated day your next period starts. ~|)
<(3)> Know your estimated cycle length: 
<(4)> Exit: 

""");
}

public static int[] calenderArray() {
int[] array = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
return array;
}

public static void loginDay() {
System.out.println("Enter day of login");
}

public static void loginMonth() {
System.out.println("Enter number <1 - 12> = (jan-dec) to get month of login. ");
}

public static int[] cycleLengthArray(int[] array, int count, int length) {
array[count] = length;
return array;
}


public static double averageCycleLength(int[] array, int count) {
int sum = 0;
double average = 0;
for (int counter = 0; counter <= count; counter++) {
sum += array[counter];
}
average = sum / (count + 1);
average = average * 10;
if (average % 10 >= 5) {
average = (average / 10) + 1;
} else {
average = (average / 10);
}
return average;
}



public static void lastCycleLength() {
System.out.println("""
Enter your last cycle length: 
 	 //i.e\\ (|~ If you want to get more accuracy, enter more than one cycle lengths. ~|)
""");
}

public static int calculateCycleLength(int[] calenderArray, int month, int day) {
int remainingDays = 0;
for (int index = 0; index < calenderArray.length; index++) {
if (month == calenderArray[index - 1]) {
remainingDays += (calenderArray[index - 1] - day);
} 
}
return remainingDays;
}

public static void messageForCycyleLength(double average) {
	if (average == 26){
	System.out.print("""
	<day1> ~ <day5> : |Menstural Phase| : '`Menstural bleeding occurs in this phase`'	
	<day6> ~ <day14> : |Follicular Phase| : '`In this stage an egg matures in preparation for ovulation, and the uterine lining starts to thickens`' 		
	<day14>    : |Ovulation Phase| : '`On this day the ovary releases an egg, which can be ferilized with sperm.`' 
	<day14> ~ <day18> : |Luteal Phase| : '`If fertilization doesn't occur, the uterine lining sheds and you start your safe phase.`' 
	<day18> ~ <day26> : |Safe Phase| : '`End of the luteal phase till your period starts again`' 
	""");
     }
	else if (average == 27){
	System.out.print("""
	<day1> ~ <day5> : |Menstural Phase| : '`Menstural bleeding occurs in this phase`'	
	<day6> ~ <day14> : |Follicular Phase| : '`In this stage an egg matures in preparation for ovulation, and the uterine lining starts to thickens`' 		
	<day14>    : |Ovulation Phase| : '`On this day the ovary releases an egg, which can be ferilized with sperm.`' 
	<day14> ~ <day19> : |Luteal Phase| : '`If fertilization doesn't occur, the uterine lining sheds and you start your safe phase.`' 
	<day19> ~ <day27> : |Safe Phase| : '`End of the luteal phase till your period starts again`' 
	""");
	}
	else if (average == 28){
	System.out.print("""
	<day1> ~ <day5> : |Menstural Phase| : '`Menstural bleeding occurs in this phase`'	
	<day6> ~ <day14> : |Follicular Phase| : '`In this stage an egg matures in preparation for ovulation, and the uterine lining starts to thickens`' 		
	<day14>    : |Ovulation Phase| : '`On this day the ovary releases an egg, which can be ferilized with sperm.`' 
	<day14> ~ <day20> : |Luteal Phase| : '`If fertilization doesn't occur, the uterine lining sheds and you start your safe phase.`' 
	<day20> ~ <day28> : |Safe Phase| : '`End of the luteal phase till your period starts again`' 
	""");
	}
	else if (average == 29) {
	System.out.print("""
	<day1> ~ <day5> : |Menstural Phase| : '`Menstural bleeding occurs in this phase`'
	<day6> ~ <day14> : |Follicular Phase| : '`In this stage an egg matures in preparation for ovulation, and the uterine lining starts to thickens`' 
	<day14>    : |Ovulation Phase| : '`On this day the ovary releases an egg, which can be ferilized with sperm.`' 
	<day14> ~ <day21> : |Luteal Phase| : '`If fertilization doesn't occur, the uterine lining sheds and you start your safe phase.`' 
	<day21> ~ <day29> : |Safe Phase| : '`End of the luteal phase till your period starts again`' 
	""");
	}
	else if (average == 30) {
	System.out.print("""
	<day1> ~ <day5> : |Menstural Phase| : '`Menstural bleeding occurs in this phase`'	
	<day6> ~ <day14> : |Follicular Phase| : '`In this stage an egg matures in preparation for ovulation, and the uterine lining starts to thickens`' 
	<day14>    : |Ovulation Phase| : '`On this day the ovary releases an egg, which can be ferilized with sperm.`' 
	<day14> ~ <day22> : |Luteal Phase| : '`If fertilization doesn't occur, the uterine lining sheds and you start your safe phase.`' 
	<day22> ~ <day30> : |Safe Phase| : '`End of the luteal phase till your period starts again`' 
	""");
	}
	else if (average == 31) {
	System.out.print("""
	<day1> ~ <day5> : |Menstural Phase| : '`Menstural bleeding occurs in this phase`'
	<day6> ~ <day14> : |Follicular Phase| : '`In this stage an egg matures in preparation for ovulation, and the uterine lining starts to thickens`' 
	<day14>    : |Ovulation Phase| : '`On this day the ovary releases an egg, which can be ferilized with sperm.`' 
	<day14> ~ <day22> : |Luteal Phase| : '`If fertilization doesn't occur, the uterine lining sheds and you start your safe phase.`' 
	<day22> ~ <day31> : |Safe Phase| : '`End of the luteal phase till your period starts again`' 
	""");
	}
	else {
	System.out.print("""
	You might have polycystic ovary syndrom - its a common hormonal disorder in women of reproductive age that causes hormonal inbalance leadiding to syntoms like irregular period, excess androgens(male hormones) and ovarian cyst
	""");
	}
}





}