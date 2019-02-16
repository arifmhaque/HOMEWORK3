package homework;

import java.util.Scanner;

public class GradeInfo {

	public static void main(String[] args) {
		int grade;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any number :");
		grade = input.nextInt();
		input.close();
		
		if(grade>90) {
			System.out.println("Student get A");
		}
		else if(grade>80) {
			System.out.println("Student get B");
			
		}
		else if(grade>70) {
			System.out.println("Student get C");
		
		}
		else {
			System.out.println("Student fail");
			
		}
	}
		
		
	
	
}
