import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please put a string here: ");
		String s = input.nextLine();
		input.close();
		
		String newS = "";
		
		for (int i = s.length() - 1; i >= 0 ; i --) {
			char tem = s.charAt(i);
			newS += tem;
		}
		System.out.println(newS);	
	}
}
