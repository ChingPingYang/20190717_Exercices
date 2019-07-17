import java.util.Scanner;

public class Main {
		
	public static String x = "";
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please git me an character: ");
		x = input.next();

		char y = x.charAt(0);
		y = Character.toLowerCase(y);
		input.close();
			
		switch (y) {
		case('a'):
			System.out.println("It's a Vowel.");
			break;
		case('e'):
			System.out.println("It's a Vowel.");
			break;
		case('i'):
			System.out.println("It's a Vowel.");
			break;
		case('o'):
			System.out.println("It's a Vowel.");
			break;
		case('u'):
			System.out.println("It's a Vowel.");
			break;
		default:
			System.out.println("It's a Consonant.");
			break;
		}
	}

}
