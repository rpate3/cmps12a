//===============================================//
////  Author:      Rahul Patel                //
////  Date:        01/16/2014           //
////  Program:     Program 1                //
////  Description: Program prompts user to input an integer and returns an approximated Euler's number based 
//// on that number, prints the actual value of Euler's number, and takes the percentage error of the 
//// theoretical value and the actual value. 
////===============================================//






import java.util.*;
public class Euler {
	public static void main(String[] args) { 

		Scanner in = new Scanner(System.in);
		System.out.print("Enter n: "); //Asks user to input an integer 
		double e1,e2 = Math.E, p=0; //Initialize variables
		double n = in.nextDouble(); //Initialize variables
		e1 = Math.pow((1+1/n),n); //Calculates theoretical 
		System.out.format("approximated e = %.10f%n", e1); //Prints theoretical value
		System.out.format("true value of e = %.10f%n", e2); //Prints actual value
		p = ((e2-e1)/e2)*100; //Calculates percentage error
		System.out.format("percentage error = %.2f", p); // Prints percentage error 
		System.out.print("%");
	}
	

}
