// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int limit = Integer.parseInt(args[0]);
		int a = (int) ((Math.random() * limit) + 1) ;
		int b = (int) ((Math.random() * limit) + 1) ;
		int c = (int) ((Math.random() * limit) + 1) ;
		System.out.println( a + " " + b + " " + c);
		int minNumber = Math.min(Math.min(a, b), c);
		int maxNumber = Math.max(Math.max(a, b), c);
		int middleNumber = Math.min(Math.max(a, b), Math.max(b, c));
		System.out.println( minNumber + " " + middleNumber + " " + maxNumber);
	}
}
