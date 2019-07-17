import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int count = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Give a String: ");
		String string = input.nextLine();
		String lowS = string.toLowerCase();
		
		System.out.println("Character you want to find: ");
		String input2 = input.next();
		String lowIn2 = input2.toLowerCase();
		char target = lowIn2.charAt(0);
		input.close();
		
		
		System.out.println("The character " + input2 + " are at index of: ");
		for (int i = 0; i < lowS.length(); i++) {
			if (lowS.charAt(i) == target) {
				System.out.print(i + ", ");
				count ++;
			} 
		}
		if (count == 0) {
			System.out.println("There's no \"" + input2 + "\" in this String.");
		}
		

	}

}
