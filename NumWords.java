// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int input = Integer.parseInt(args[0]);
		int hundreds = input / 100;
		int tens = (input / 10) % 10;
		int units = input % 10;
		// Format: 5 hundreds, 1 tens, and 7 ones.
		String outputMessage = String.format("%d hundreds, %d tens, and %d ones.", hundreds, tens, units);
		System.out.println(outputMessage);
	}
}
