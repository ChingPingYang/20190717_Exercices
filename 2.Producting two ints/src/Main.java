import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please put your first integer number: ");
		int x = input.nextInt();
		
		System.out.println("Please put your second integer number: ");
		int y = input.nextInt();
		input.close();
		
		int result = x + y;
		
		System.out.printf("The result of adding these two numbers is: %d", result);
	}

}
