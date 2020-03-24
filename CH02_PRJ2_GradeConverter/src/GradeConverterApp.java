import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Grade Converter app!");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			System.out.println("Enter Numeric Grade: ");
			int numericGrade = sc.nextInt();
			String letterGrade = "";
			
			if (numericGrade >= 88) {
				letterGrade = "A";
			}
			else if (numericGrade >= 80) {
				letterGrade= "B";
			}
			else if (numericGrade >= 67) {
				letterGrade= "B";
			}
			else if (numericGrade >= 60) {
				letterGrade= "B";
			}
			else {
				letterGrade = "F";
			}
			System.out.println("Letter grade: "+letterGrade);
			System.out.println("Continue? ");
			choice = sc.next();
		}
		
		
		System.out.println("Goodbye");

	}

}
