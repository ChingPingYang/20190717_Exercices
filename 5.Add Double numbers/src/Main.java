import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("First double number: ");
		double num1 = input.nextDouble();
		System.out.println("Second double number: ");
		double num2 = input.nextDouble();
		input.close();
		
		double sum = num1 + num2;
		
		System.out.println("The sum of these two number is: " + sum);
		
		
		
		
		
		
	}
}
