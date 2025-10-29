// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		int lim = Integer.parseInt(args[0]);
		// Making sure generated number is not 0 in tests
		int a = Math.max(1, (int)(Math.random() * lim));
		int b = Math.max(1, (int)(Math.random() * lim));
		int c = Math.max(1, (int)(Math.random() * lim));

		System.out.println(a + " " + b + " " + c);

		int firstPair = Math.min(a, b);
		int secondPair = Math.min(a, c);
		int thirdPair = Math.min(b, c);

		int smallest = Math.min(firstPair, c);
		int largest = Math.max(Math.max(a,b), c);

		int middle = Math.max(Math.max(firstPair, secondPair), thirdPair); // Largest out of the smallest pairs

		System.out.println("Largest: " + largest + ", Middle: " + middle + " Smallest: " + smallest);
		


	}
}
