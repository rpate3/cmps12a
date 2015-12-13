/*
 * Author: rpate3 (Rahul Patel) 
 * Assignment: Lab 5 
 * Date Last Modified: March 7, 2014
 * Description: Prints out an Array table and then reprints the same Array table with the values shifted to the left. 
 */





import java.text.DecimalFormat;

public class CQueue  {
	int size;//Declare integers and arrays
	float[] c; 
	float []buffer;
	public CQueue(int i) {
	this.size = i; 
	buffer  = new float[size]; 
	
	}
	public void print() {//Print method
		DecimalFormat df = new DecimalFormat("0.00");
		for(int counter = 0; counter<this.size; counter++){
		System.out.println("Element   " +counter+":   " + df.format(this.buffer[counter]));//Prints out values correctly formatted 
		}
	}
	public void shift() {//Shift method
		c = new float[size];
		c[this.size -1] = this.buffer[0];//Shifts the values of the array 
		for(int front= 1; front<this.size; front++){
			int newplace = (front-1)%size;//Shifts left (up one)
				c[newplace] = this.buffer[front]; 
		}
		this.buffer = c; 
	}
}
