// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int limit = Integer.parseInt(args[0]);
		int a = (int) ((Math.random() * limit)) ;
		int b = (int) ((Math.random() * limit)) ;
		int c = (int) ((Math.random() * limit)) ;
		System.out.println( a + " " + b + " " + c);
		int minNumber = Math.min(Math.min(a, b), c);
		int maxNumber = Math.max(Math.max(a, b), c);
		int middleNumber = Math.min(Math.min(Math.max(a, b), Math.max(b, c)), Math.max(a,c));
		System.out.println( minNumber + " " + middleNumber + " " + maxNumber);
	}
}
