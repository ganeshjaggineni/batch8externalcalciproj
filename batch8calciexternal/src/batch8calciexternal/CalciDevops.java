package batch8calciexternal;
import java.util.*;
class CalciDevops {

	 public static void main(String[] args) {
	        if (args.length < 3) {
	            System.out.println("Insufficient arguments provided. Usage: <operation> <num1> <num2>");
	            return;
	        }

	        String operation = args[0]; // Case-sensitive matching
	        double num1 = Double.parseDouble(args[1]);
	        double num2 = Double.parseDouble(args[2]);

	        switch (operation) {
	            case "Addition":
	                System.out.println("Result: " + (num1 + num2));
	                break;
	            case "Subtraction":
	                System.out.println("Result: " + (num1 - num2));
	                break;
	            case "Multiplication":
	                System.out.println("Result: " + (num1 * num2));
	                break;
	            case "Division":
	                if (num2 != 0) {
	                    System.out.println("Result: " + (num1 / num2));
	                } else {
	                    System.out.println("Error: Division by zero");
	                }
	                break;
	            default:
	                System.out.println("Invalid operation. Choose Add, Subtract, Multiply, or Divide.");
	        }
	    }
}
