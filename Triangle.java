/*
 Author: rpate3 (Rahul Patel) && schadha2 (Sejal Chadha) 
Assignment: Program 3 
Last modified: February 12, 2014
Decription: Prints right traingle based on dimensions inputed by user, which are printed in a format to make a larger right trriangle. 
 */





import java.util.Scanner;//Import scanner



public class Triangle {
	public static void main(String[] args) {
		System.out.print("Enter dimensions: "); 
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();//Declare variables
		int size = scan.nextInt(); 
		char ch = scan.next().charAt(0);
	
	
	for(int l = 0; l< length; l++){            //Determines how many triangles are along the left side         
		 for (int i = 1; i <= size; i++) {	//Determines size of smaller triangle			
		     for(int y= 0; y<=l; y++){     //Determines how many triangles are printed horizontally
			 for (int s = 1; s <= i; s++) { //Prints out characters
		            System.out.print(ch);
			 			}
		        for(int c=0; c< size-i; c++){ //Prints out spaces after characters 
	            	System.out.print(" ");
	            	}
		     	}	
		        System.out.println();
			 }
		 }
		System.out.println("Have a nice day. Bye.");
	} 
}
