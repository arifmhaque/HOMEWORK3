package homework;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		int [] subject = new int[6];
		System.out.print("Please Enter Any 6 Grade Point =");
		int sum = 0;
		
		for( int i = 0; i<subject.length; i++) {
			subject[i] = input1.nextInt();
			}
		for(int i =0; i<subject.length; i++) {
			sum = sum + subject[i];
		}
	    System.out.println("Total Grade Point =" + sum);
		System.out.println("Average Grade point =" + sum/subject.length);
		input1.close();
		

	}

	}


