
public class Factorial {
	

	public static void main(String[] args) {
		  int number = 5; // You can change this value
	        long factorial = 1;

	        for (int i = 1; i <= number; i++) {
	            factorial *= i;
	        }

	        System.out.println("Factorial of " + number + " is: " + factorial);
	    }
	}