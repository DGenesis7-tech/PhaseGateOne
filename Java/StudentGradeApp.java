import java.util.Scanner;
public class StudentGradeApp {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
StudentGradeAppFunction object = new StudentGradeAppFunction();
int scoreSubject = 0;
String output1 = "";
String output2= "";


System.out.println("How many students do you have");
int numOfStudents = input.nextInt();
System.out.println("How many subjects do they offer");
int numOfSubjects = input.nextInt();
int[][] studentsSubjectsArray = new int[numOfStudents][numOfSubjects];
double[] averageScores = new double[numOfStudents];
int[] totalScores = new int[numOfSubjects];
object.successOutput();

studentsSubjectsArray = object.studentsSubjectsScores(studentsSubjectsArray, scoreSubject, numOfStudents, numOfSubjects);

output1 = object.output1(numOfSubjects, output1);
System.out.println(output1);
object.output2(studentsSubjectsArray, numOfStudents, numOfSubjects); 












}
}