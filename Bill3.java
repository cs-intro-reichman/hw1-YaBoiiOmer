// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
		String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		double totalCost = Double.parseDouble(args[3]);
		double costForEach = Math.ceil(totalCost / 3);
		String outputMessage = String.format("Dear %s, %s, and %s: pay %.02f Shekels each.", name3, name2, name1, costForEach);
		System.out.println(outputMessage);

	}
}
