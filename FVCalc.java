// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code

		int investment = Integer.parseInt(args[0]);
		int years = Integer.parseInt(args[1]);
		double interestRate = Double.parseDouble(args[2]) / 100;

		double futureValue = investment * Math.pow((1 + interestRate), years);
		// Format: After 25 years, $25000 saved at 6.0% will yield $107296
		String outputMessage = String.format("After %d years, $%d saved at %.01f%% will yield $%d", years, investment, interestRate, ((int) futureValue));
		System.out.println(outputMessage);
		
	}
}