package com.bridgelabz.linecomparison;

import java.util.Scanner;

/**
 * Program to calculate length of line based on a point consisting of (x, y)
 * co-ordinates using the Cartesian system.
 * 
 * @author : Snehal Patil
 *
 */
public class LineComparison {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the  Co-ordinates of start point ( x1 , y1 ) = ");
		double startX1 = sc.nextDouble();
		double startY1 = sc.nextDouble();

		System.out.print("Enter the  Co-ordinates of end point ( x2 , y2 ) = ");
		double endX2 = sc.nextDouble();
		double endY2 = sc.nextDouble();

		// Calculating Length of line
		double length = Math.sqrt(Math.pow((endX2 - startX1), 2) + Math.pow((endY2 - startY1), 2));
		System.out.println();
		System.out.println("Length of Line = " + length);
	}
}
