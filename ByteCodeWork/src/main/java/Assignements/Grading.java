package Assignements;
import java.util.Scanner;
public class Grading {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of students = ");
		int nos = sc.nextInt();
		int i =0;int max=0;int min=101;
		int gradeA= 0;int gradeB= 0;int gradeC= 0;int gradeD= 0;int gradeF= 0;
		while(i<nos) {
			System.out.print("Enter student "+(i+1)+" marks = ");
			int mark = sc.nextInt();
			if (mark>0 && mark<100) {
				if(max<mark) {
					max=mark;
				}
				if(min>mark) {
					min=mark;
				}
				if (mark>=90 && mark<=100) {
					System.out.println("Student "+(i+1)+" got A Grade");
					gradeA+=1;
				}
				else if (mark >=80 && mark<90) {
					System.out.println("Student "+(i+1)+" got B Grade");
					gradeB+=1;
				}
				else if (mark >=70 && mark<80) {
					System.out.println("Student "+(i+1)+" got C Grade");
					gradeC+=1;
				}
				else if (mark >=60 && mark<70) {
					System.out.println("Student "+(i+1)+" got D Grade");
					gradeD+=1;
				}
				else {
					System.out.println(("Student "+(i+1)+" got F Grade"));
					gradeF+=1;
				}
			}
			else {
				System.out.println("Invalid Details Please Try again");
				continue;
			}
			i++;
		}
		System.out.println("Total no of students = "+nos);
		System.out.println("Total no of who got A Grade = "+gradeA);
		System.out.println("Total no of who got B Grade = "+gradeB);
		System.out.println("Total no of who got C Grade = "+gradeC);
		System.out.println("Total no of who got D Grade = "+gradeD);
		System.out.println("Total no of who got F Grade = "+gradeF);
		System.out.println("Maximum marks = "+max);
		System.out.println("Maximum marks = "+min);
	}
}
