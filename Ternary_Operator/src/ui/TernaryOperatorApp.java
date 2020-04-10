package ui;

public class TernaryOperatorApp {

	public static void main(String[] args) {
		System.out.println("Red light green light!");
		// red, green light.. what to do?
		String lightColor = "red"; // or green
		System.out.println("Light color is: "+lightColor);
		String action = "";
								
		//set the action based on light color
		//if/else
		//if(lightColor.equalsIgnoreCase("red")) {
			//action = "stop";
		//}
		//else {
			//action = "go";
		//}
		
		// - ternary operator example
		action = lightColor.equalsIgnoreCase("red") ? "STOP!!" : "GO!!";
		System.out.println("Action is: "+action);

		System.out.println("Bye!");
	}

}
