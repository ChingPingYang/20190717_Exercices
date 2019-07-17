import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This is a program for checking leap year.\nPlease put the year you want to check: ");
		int x = input.nextInt();
		input.close();
		boolean result = false;
		
		if (x % 4 == 0) {
			result = true;
			if (x % 100 == 0) {
				if (x % 400 != 0) {
					result = false;
				}
			}
		} else {
			result = false;
		}
		
		if (result == true ) {
			System.out.println("It's a leap year.");
		} else {
			System.out.println("It's not a leap year.");
		}
		
	}

}
