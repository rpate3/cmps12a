//===============================================//
////  Author:      rpate3 (Rahul Patel)                  //
////  Date:        January 30, 2014           //
////  Program:     Program 2  assignment                //
////  Description: Prompts user to enter a date. The program then calculates the number of days till Christmas from the entered date 
//		   accounting for leap years. If the user enters Christmas day the program returns Merry Christmas.  
//		   If the month entered is greater than 12 or less than 1 the program returns invalid month.         //
////             //
////===============================================//

import java.util.Scanner; //Import Scanner

public class XMas {
	public static void main(String[] args) {
		System.out.print("Enter date: "); //Prompts user to enter date 
		Scanner scan = new Scanner(System.in);
		int date = scan.nextInt();//User enters date in a DDMMYYYY format
		int day, Ayear, days, month, months, Amonth, Aday; 	//Declare variables
		Ayear = date%10000; //Isolates year
	day = date - Ayear;
	days = day/10000;
	Aday = days%100;//Isolates day
	month= days%100;
	months = days-month;
	Amonth = months/100;//Isolates month
	switch (Amonth) { 
	case 1: //Case for January
		if(Aday > 31) {
			System.out.println("Invalid input.");
		} else{
		 System.out.println("Date is: January " + Aday + ", " + Ayear);//Prints out month, day, and year
		 if((Ayear%4 == 0) && !(Ayear%100 == 0) || (Ayear%400) == 0) { //Checks for leap year
			 Aday = ((Aday/10000 + 360)-Aday);//Calculates days till Christmas
		 } else
		 Aday = ((Aday/10000)+359)-Aday; }//Calculates days till Chrismtas
		 System.out.println("Days until Christmas: " + Aday); //Prints out days till Christmas
		 break; 	
	case 2: //Case for Februrary
		if((Ayear%4 == 0) && !(Ayear%100 == 0) || (Ayear%400) == 0) {
			if (Aday > 29) { 
				System.out.println("Invalid input.");
			} else {
			System.out.println("Date is: February " + Aday + ", " + Ayear);//Prints out month, day, and year
			Aday = ((Aday/10000) + 329)-Aday;//Calculate days till Christmas
			System.out.println("Days until Christmas: " + Aday); }//Prints out  days till Chrismtas
		}else { 
			if(Aday > 28) { 
				System.out.println("Invalid input.");
			} else {
			System.out.println("Date is: February " + Aday + ", " + Ayear);//Prints out month, day, and year
			Aday = ((Aday/10000) + 328)- Aday;//Calculate days till Christmas
			System.out.println("Days until Christmas: " + Aday); }//Prints out days till Christmas
		}
		 break;
	case 3:  //Case for March
		if(Aday > 31) {
			System.out.println("Invalid input.");
		} else{
		System.out.println("Date is: March " + Aday + ", " + Ayear);//Prints out month, day, and year
		Aday = ((Aday/10000)+300)-Aday; //Calculates days till Christmas
		System.out.println("Days until Christmas: " + Aday); }//Prints out days till Christmas
		break;
	case 4: //Case for April
		if(Aday > 30) {
			System.out.println("Invalid input.");
		} else{
		System.out.println("Date is: April " + Aday + ", " + Ayear);//Prints out month, date, and year
		Aday = ((Aday/10000)+269)-Aday; //Calculates days till Christmas
		System.out.println("Days until Christmas: " + Aday); }//Prints out days till Christmas
		break;
	case 5: //Case for May
		if(Aday > 31) {
			System.out.println("Invalid input.");
		} else{
		System.out.println("Date is: May " + Aday + ", " + Ayear);//Prints out month, date, and year
		Aday = ((Aday/10000)+239)-Aday; //Calculates days till Christmas
		System.out.println("Days until Christmas: " + Aday); }//Prints out days till Christmas
		break;
	case 6: //Case for June
		if(Aday > 30) {
			System.out.println("Invalid input.");
		} else{
		System.out.println("Date is: June " + Aday + ", " + Ayear);//Prints out month, date, and year
		Aday = ((Aday/10000)+208)-Aday; //Calculates days till Christmas
		System.out.println("Days until Christmas: " + Aday); }//Prints out days till Christmas
		break;
	case 7: //Case for July
		if(Aday > 31) {
			System.out.println("Invalid input.");
		} else{
		System.out.println("Date is: July " + Aday + ", " + Ayear);//Prints out month, day, and year
		Aday = ((Aday/10000)+178)-Aday; //Calculates days till Christmas
		System.out.println("Days until Christmas: " + Aday); }//Prints out days till Christmas
		break;
	case 8: //Case for August
		if(Aday > 31) {
			System.out.println("Invalid input");
		} else{
		System.out.println("Date is: August " + Aday + ", " + Ayear);//Prints out month, day, and year
		Aday = ((Aday/10000)+147)-Aday; //Calculates days till Chrismtas
		System.out.println("Days until Christmas: " + Aday); //Prints out days till Christmas
		}
		break;
	case 9: //Case for September
		if(Aday > 30) {
			System.out.println("Invalid input.");
		} else{
		System.out.println("Date is: September " + Aday + ", " + Ayear);//Prints out month, day, and year
		Aday = ((Aday/10000)+116)-Aday; //Calculates days till Christmas
		System.out.println("Days until Christmas: " + Aday); }//Prints out days till Christmas
		break;
	case 10: //Case for October
		if(Aday > 31) {
			System.out.println("Invalid input.");
		} else{
		System.out.println("Date is: October " + Aday + ", " + Ayear);//Prints out month, day, and year
		Aday = ((Aday/10000)+86)-Aday; //Calculates days till Christmas
		System.out.println("Days until Christmas: " + Aday); }//Prints out days till Christmas
		break;
	case 11: //Case for November
		if(Aday > 30) {
			System.out.println("Invalid input.");
		} else{
		System.out.println(Aday <= 30? "Date is: November " + Aday + ", " + Ayear : "Invalid Input");//Prints out month, day, and year
		Aday = ((Aday/10000)+55)-Aday; //Calculates days till Christmas
		System.out.println("Days until Christmas: " + Aday); }//Prints out days till Christmas
		break;
	case 12: //Case for December
		if(Aday > 31) {
			System.out.println("Invalid input.");
		} else{
		System.out.println("Date is: December " + Aday + ", " + Ayear);//Prints out month, day, and year
		if (Aday == 25) { 
			System.out.println("Merry Christmas!");//If day entered is 25th 
		}
		else { 
			Aday = ((Aday/10000)+25)-Aday; //Calculate days till Christmas
		System.out.println(month <= 25? "Days until Christmas: " + Aday : "Invalid Input.");//Prints out days till Christmas
		}
		}
		break;
		default: 
			System.out.println("Invalid month.");//If month entered is less than 1 or greater than 12
	
	}
	}
	}
	
