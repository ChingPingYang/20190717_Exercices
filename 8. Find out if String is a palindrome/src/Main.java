import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please put a string here: ");
		String s = input.nextLine();
		
		if (s.length() < 2) {
			System.out.println("It's too short.");
		} else {
		
			if (s.length() % 2 == 0 ) {
				String x = s.substring(0, s.length()/2);
				String y = "";
				for (int i = s.length() - 1; i >= s.length()/2; i--) {
					 char tem = s.charAt(i);
					 y += tem;
					 
				}
				checkEqual(x, y);
			} 
			
			if (s.length() % 2 != 0) {
				String x = s.substring(0, (s.length() - 1) / 2);
				String y = "";
				for (int i = s.length() - 1; i >= ((s.length() - 1) / 2) + 1; i-- ) {
					char tem = s.charAt(i);
					y += tem;
				}
				checkEqual(x, y);
			} 
		}
		
	}
	
	
	public static void checkEqual(String x, String y) {
		if (x.equals(y)) {
			System.out.println("This is a Palindrome string.");
		} else {
			System.out.println("It's not a Palindrome string.");
		}
	}

}
