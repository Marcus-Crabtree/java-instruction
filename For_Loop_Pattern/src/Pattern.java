import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		
		System.out.println("Hello, how many stars would you like?");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int numOfChars = scan.nextInt();
		for (int i = 1; i <=numOfChars; i++) {
			for(int j =0; j < i; j++) {
				System.out.print(">");
			}
			System.out.println();
		}	
		
		for(int i=numOfChars-1;i>0; i--) {
			for(int j =0; j < i; j++) {
				System.out.print(">");
			}
			System.out.println();
		}
	}

}
