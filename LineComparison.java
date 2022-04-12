package com.bridgelabz.linecomparison;

import java.util.Scanner;

/**
 * Program to check which line is equal, greater or less than the other line
 * using Java compareTo method
 * 
 * @author : Snehal Patil
 *
 */
public class LineComparison {
	// Use Wrapper class to use equals method
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
	public static void compareToMehod() {
		int check = lengthFirst.compareTo(lengthSecond);
		if (check == 0) {
			System.out.println("The length of line 1 is equals to line 2");
		} else if (check > 0) {
			System.out.println("The length of line 1 is greater than  line 2");
		} else
			System.out.println("The length of line 1 is less than line 2");
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
		 * Calling compareToMehod() method to check length of two lines are equal or not
		 */
		compareToMehod();
	}
}
