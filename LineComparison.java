package com.bridgelabz.linecomparison;

import java.util.Scanner;

/**
 * Program to check equality of two lines Java equals method
 * 
 * @author : Snehal Patil
 *
 */
public class LineComparison {
	/// use Wrapper class to use equals method
	static Double lengthFirst = 0.0d;
	static Double lengthSecond = 0.0d;

	public static double Length_Calculation() {
		// Taking line start point and end point co-ordinates
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the  Co-ordinates of start point ( x1 , y1 ) = ");
		double startX1 = sc.nextDouble();
		double startY1 = sc.nextDouble();

		System.out.print("Enter the  Co-ordinates of end point ( x2 , y2 ) = ");
		double endX2 = sc.nextDouble();
		double endY2 = sc.nextDouble();

		// Calculating length of line
		double length = Math.sqrt(Math.pow((endX2 - startX1), 2) + Math.pow((endY2 - startY1), 2));
		System.out.println("Length of Line = " + length);
		System.out.println();

		return length;
	}

	// Method for compare length of lines
	public static void lengthComparison() {
		if (lengthFirst.equals(lengthSecond)) {
			System.out.println("The length of lines are equal");
		} else {
			System.out.println("The length of lines are not equal");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program !");
		System.out.println();

		// Calling Length_Calculation() method to calculate length of first line
		System.out.println("For first line");
		lengthFirst = Length_Calculation();

		// Calling Length_Calculation() method to calculate length of second line
		System.out.println("For second line");
		lengthSecond = Length_Calculation();

		/*
		 * Calling lengthComparison() method to check length of two lines are equal or
		 * not
		 */
		lengthComparison();
	}
}
