//===============================================//
////  Author:      rpate3 (Rahul Patel)                  //
////  Date:        January 30, 2014           //
////  Program:     Program 2 Bonus Assignment                //
////  Description: User enters in a date. The program then calculates the days till Christmas accoutning for leap years.
//		   If the date entered is Christmas day then the program prints out Merry Christmas. If the month entered
//		   is greater than 12 or less than 1 the program prints out invalid month. Furthermore the program prints 
//		   out the day of the week Christmas falls on in that year.        //
////                               //
////===============================================//




import java.util.Scanner;


public class BonusXMas {
	public static void main(String[] args) {
		System.out.print("Enter date: ");
		Scanner scan = new Scanner(System.in);
		int date = scan.nextInt();
		int day, Ayear, days, month, months, Amonth, Aday, Hday = 0, Hyear, H1year, Step2 = 0, DOW, ADOW = 0;
		Ayear = date%10000;
	day = date - Ayear;
	days = day/10000;
	Aday = days%100;
	month= days%100;
	months = days-month;
	Amonth = months/100;
	
	
	
	switch (Amonth) { 
	
	case 1: 
		if(Aday > 31) {
			System.out.println("Invalid input");
		} else{
		 System.out.println("Date is: January " + Aday + ", " + Ayear);
		 Aday = ((Aday/10000)+359)-Aday;
		 System.out.println("Days until Christmas: " + Aday); }
		 break; 
		
	case 2: 
		if((Ayear%4 == 0) && !(Ayear%100 == 0) || (Ayear%400) == 0) {
			System.out.println("Date is: February " + Aday + "," + Ayear);
			Aday = ((Aday/10000) + 329)-Aday;
			System.out.println("Days until Christmas: " + Aday);
		}else { 
			System.out.println("Date is: February " + Aday + "," + Ayear);
			Aday = ((Aday/10000) + 328)- Aday;
			System.out.println("Days until Christmas: " + Aday);
		}
		 break;
	case 3:  
		if(Aday > 31) {
			System.out.println("Invalid input");
		} else{
		System.out.println("Date is: March " + Aday + "," + Ayear);
		Aday = ((Aday/10000)+300)-Aday; 
		System.out.println("Days until Christmas: " + Aday); }
		break;
		
	case 4: 
		if(Aday > 30) {
			System.out.println("Invalid input");
		} else{
		System.out.println("Date is: April " + Aday + "," + Ayear);
		Aday = ((Aday/10000)+269)-Aday; 
		System.out.println("Days until Christmas: " + Aday); }
		break;
	
	case 5: 
		if(Aday > 31) {
			System.out.println("Invalid input");
		} else{
		System.out.println("Date is: May " + Aday + "," + Ayear);
		Aday = ((Aday/10000)+239)-Aday; 
		System.out.println("Days until Christmas: " + Aday); }
		break;
	
	
	case 6: 
		if(Aday > 30) {
			System.out.println("Invalid input");
		} else{
		System.out.println("Date is: June " + Aday + "," + Ayear);
		Aday = ((Aday/10000)+208)-Aday; 
		System.out.println("Days until Christmas: " + Aday); }
		break;
		
	case 7: 
		if(Aday > 31) {
			System.out.println("Invalid input");
		} else{
		System.out.println("Date is: July " + Aday + "," + Ayear);
		Aday = ((Aday/10000)+178)-Aday; 
		System.out.println("Days until Christmas: " + Aday); }
		break;
	case 8: 
		if(Aday > 31) {
			System.out.println("Invalid input");
		} else{
		System.out.println("Date is: August " + Aday + "," + Ayear);
		Aday = ((Aday/10000)+147)-Aday; 
		System.out.println("Days until Christmas: " + Aday); }
		break;
		
	case 9: 
		if(Aday > 30) {
			System.out.println("Invalid input");
		} else{
		System.out.println("Date is: September " + Aday + "," + Ayear);
		Aday = ((Aday/10000)+116)-Aday; 
		System.out.println("Days until Christmas: " + Aday); }
		break;
		
	case 10: 
		if(Aday > 31) {
			System.out.println("Invalid input");
		} else{
		System.out.println("Date is: October " + Aday + "," + Ayear);
		Aday = ((Aday/10000)+86)-Aday; 
		System.out.println("Days until Christmas: " + Aday); }
		break;
	
	case 11: 
		if(Aday > 30) {
			System.out.println("Invalid input");
		} else{
		System.out.println(Aday <= 30? "Date is: November " + Aday + "," + Ayear : "Invalid Input");
		Aday = ((Aday/10000)+55)-Aday; 
		System.out.println("Days until Christmas: " + Aday); }
		break;

	case 12: 
		if(Aday > 31) {
			System.out.println("Invalid input");
		} else{
		System.out.println("Date is: December " + Aday + "," + Ayear);
		if (Aday == 25) { 
			System.out.println("Merry Christmas!");
		}
		else { 
			Aday = ((Aday/10000)+25)-Aday; 
		System.out.println(month <= 25? "Days until Christmas: " + Aday : "Invalid Input.");
		}
		}
		break;
		
		default: 
			System.out.println("Invalid month.");
	
	}
	
	if (Amonth == 1 || Amonth == 10) { 
		Hday = (Aday + 0); 
	} else if (Amonth == 2 || Amonth == 3 || Amonth == 11) {
		Hday = (Aday + 3 ); 
	} else if (Amonth == 4 || Amonth == 7) { 
		Hday = (Aday + 6); 
	} else if (Amonth == 5) {
		Hday = (Aday + 1); 
	} else if (Amonth == 6) { 
		Hday = (Aday + 4); 
	} else if (Amonth == 8) { 
		
		Hday = (Aday + 2); 
	} else if (Amonth == 9 || Amonth == 12) {
		Hday = (Aday + 5); 
	}
	
	if (Hday > 6) {
		Hday = (Hday - (Hday/7)*7);
	}
		Hyear = (Ayear - (Ayear/28)*28);
		H1year = Hyear + (Hyear/4);
			if (Ayear < 1699) { 
				Step2 = H1year; 
			} else if (Ayear < 1799 && Ayear > 1700) {
				Step2 = H1year + 5;
			} else if (Ayear < 1899 && Ayear > 1800) { 
				Step2 = H1year + 3; 
			} else if (Ayear < 1999 && Ayear > 1900) { 
				Step2 = H1year + 1;
			} else if (Ayear < 2999 && Ayear > 2000) { 
				Step2 = H1year; 
			}
		DOW = Hday + Step2; 
			if (DOW > 6) { 
			 ADOW = 	DOW - ((DOW/7)*7); 
			 
			}
			
		switch (ADOW) { 
		case 1: System.out.println("Christmas in " + Ayear + " falls on a Sunday.");
		break;
		case 2: System.out.println("Christmas in " + Ayear + " falls on a Monday.");
		break;
		case 3: System.out.println("Christmas in " + Ayear + " falls on a Tuesday.");
		break;
		case 4: System.out.println("Christmas in " + Ayear + " falls on a Wednesday.");
		break;
		case 5: System.out.println("Christmas in " + Ayear + " falls on a Thursday.");
		break;
		case 6: System.out.println("Christmas in " + Ayear + " falls on a Friday.");
		break;
		case 0: System.out.println("Christmas in " + Ayear + " falls on a Saturday.");
		break;
		case 7: System.out.println("Christmas in " + Ayear + " falls on a Saturday.");
		break;
		}
	
	}
	}
