import java.util.Scanner;

public class Main {
		
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Give a String: ");
		String x = input.next();
		input.close();
		
		int vowelC = 0;
		int ConsC = 0;
			
		for (int i = 0; i < x.length(); i++) {
			char y = x.charAt(i);			
			switch (y) {
			case('a'):
				vowelC += 1;
				break;
			case('e'):
				vowelC += 1;
				break;
			case('i'):
				vowelC += 1;
				break;
			case('o'):
				vowelC += 1;
				break;
			case('u'):
				vowelC += 1;
				break;
			default:
				ConsC += 1;
				break;
			}
		}
		
		System.out.printf("There are %d of Vowels and %d of Consonants in this String.", vowelC, ConsC);
		
	}

}
