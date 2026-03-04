/**
	* File: 1.12 Classwork
	* Author: Peter Zheng
	* Date Created: March 4, 2026
	* Date Last Modified: March 4, 2026
	*/


import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);

		System.out.print("Input an integer: ");
		int num = input.nextInt();
		num = num + 3;
		System.out.println(num);

	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		String num = (input.nextLine() + "4");
		double newnum = Double.parseDouble(num);
		System.out.println(newnum + 2);
		

	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);

		System.out.print("Input a radius: ");
		double rad = input.nextDouble();
		System.out.println(3.14 * (rad * rad));
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		Double num = input.nextDouble();
		num = (num*12);
		System.out.println(Math.floor(num));
	}

}
