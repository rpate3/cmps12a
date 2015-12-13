import java.text.DecimalFormat;
import java.util.Scanner;


public class Temperature {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); 
		System.out.print("Enter temperature: ");
		double temp = scan.nextDouble();
		char letter = scan.next().charAt(0); 
		DecimalFormat df = new DecimalFormat("0.00");
		
		double c, f, k;
		
		switch(letter) { 
	
		
		case 'C': 
		case 'c':
			k = temp + 273.15f;
			f = (k*(9f/5f)-459.67f); 
			System.out.println(df.format(temp) + " Centigrade " + "= " + df.format(f) + " Fahrenheit " + "= " + df.format(k) + " Kelvin");
			System.out.println("Have a nice day. Goodbye.");
			break;
		
		case 'F' : 
		case 'f' :
			 c = (temp-32)*(5f/9f); 
			 k = (c+273.15f);
			System.out.println(df.format(c) + " Centigrade" + " = " + df.format(temp) + " Fahrenheit" + " = " + df.format(k) + " Kelvin");
			System.out.println("Have a nice day. Goodbye.");
			break;

		case 'K': 
		case 'k':
			 f = (temp*(9f/5f)-459.67f); 
			 c = (temp - 273.15f); 
			System.out.println(df.format(c) + " Centigrade" + " = " + df.format(f) + " Fahrenheit" + " = " + df.format(temp) + " Kelvin");
			System.out.println("Have a nice day. Goodbye.");
			break;
		
		default: System.out.println(letter + " is an unknown temperature scale."); 
		System.out.println("Goodbye.");
		break;
		}	
	}
}
