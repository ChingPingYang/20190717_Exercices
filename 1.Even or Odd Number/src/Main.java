import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please put a integer number: ");
		int x = input.nextInt();
		input.close();
		
		if (x % 2 == 0) {
			System.out.println("It's an Even number.");
		} else {
			System.out.println("It's an Odd number.");
		}
	}
}
