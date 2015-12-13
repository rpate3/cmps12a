import java.util.Scanner;
public class Checker {
	public static void main(String[] args) {
		System.out.print("Enter Checkerboard height, width, cell size, and character : "); //prompt user to enter in dimensions
		Scanner scan = new Scanner(System.in);
		int height = scan.nextInt(), width = scan.nextInt(),cell = scan.nextInt(),swidth = (width/2 + width%2); //declare variables
		char ch = scan.next().charAt(0);
		
		 for ( int r  = 1 ; r < height+1 ; r++ ) {  //prints out the whole board
			 for(int i = 0; i< cell; i++){  //code for columns
				 for(int i1 = 0; i1 < (swidth); i1++){ 
				 if (r%2 == 0) { 
					 for(int i2 = 0; i2<cell; i2++){ 
						 System.out.print(" ");}}//prints out the spaces
		if(!(i1==swidth+1 && r%2 == 1)) { 
			for (int i2 = 0; i2 < cell; i2++) {//code for the cell
				System.out.print(ch);}}//print out character
			if(r%2!=0){ 
				for(int i2=0; i2 < cell; i2++){ 
					System.out.print(" ");}}}
		System.out.println();

	}}System.out.println("Have a nice day. Goodbye.");
 }}
