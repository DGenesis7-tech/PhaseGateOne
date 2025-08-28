import java.util.Scanner;
public class StudentGradeAppFunction {

public static void successOutput() {
System.out.println("""
Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>
Saved successfuly
""");
}

public static int[][] studentsSubjectsScores(int[][] studentsSubjectsArray, int scoreSubject, int numOfStudents, int numOfSubjects) {
Scanner input = new Scanner(System.in);
for (int count = 1; count <= numOfStudents; count++) {
for (int counter = 1; counter <= numOfSubjects; counter++) {
System.out.println("Entering score for student" + count);
System.out.println("Enter score for subject" + counter);
scoreSubject = input.nextInt();
studentsSubjectsArray[count - 1][counter - 1] = scoreSubject;
System.out.println("""
Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>
Saved successfuly
""");
}
}
return studentsSubjectsArray;
}

public static String output1(int numOfSubjects, String output) {
output = "STUDENT	  	";
for (int counter = 1; counter <= numOfSubjects; counter++) {
output += "SUB" + counter + "    "; 
}
output += "TOT    AVE     POS";
return output;
}

public static double[] averageScores(int[][] studentsSubjectsArray, double[] average, int numOfStudents, int numOfSubjects) {
int total = 0;
for (int count = 1; count <= numOfStudents; count++) {
for (int counter = 1; counter <= numOfSubjects; counter++){
total += studentsSubjectsArray[count - 1][counter - 1];
}
average[count - 1] = total / numOfSubjects;
total = 0;
}
return average;
}


public static int[] totalScores(int[][] studentsSubjectsArray, int[] total, int numOfStudents, int numOfSubjects) {
int preTotal = 0;
for (int count = 1; count <= numOfStudents; count++) {
for (int counter = 1; counter <= numOfSubjects; counter++){
preTotal += studentsSubjectsArray[count - 1][counter - 1];
}
total[count - 1] = preTotal;
preTotal = 0;
}
return total;
}

public static void output2(int[][] studentsSubjectsArray, int numOfStudents, int numOfSubjects ) {
String[] outputArray = new String[numOfStudents];
int[] totalArray = new int[numOfStudents];
double[] averageArray = new double[numOfStudents];
double average = 0;
int total = 0;
String output = "";
for (int count = 0; count < numOfStudents; count++) {
output = "Student " + (count + 1) + "	  ";
for (int counter = 0; counter < numOfSubjects; counter++) {
output += studentsSubjectsArray[count][counter] + "    "; 
total += studentsSubjectsArray[count][counter];
}
average = total / numOfSubjects;
outputArray[count] = output; 
totalArray[count] = total; 
averageArray[count] = average; 
output = "";
total = 0;
average = 0;
}
for (int index = 0; index < numOfStudents; index++) {
System.out.println(outputArray[index] + totalArray[index] + "    " + averageArray[index]);
}
}










}