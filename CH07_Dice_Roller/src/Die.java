

public class Die {
	
	private int faceValue;
	 //method roll dice
	
	public void rollDie() {
		faceValue = (int)(Math.random() * 6) +1; 
	}//end of method

// facevalue method to return current face value
public int getFaceValue() {
	return faceValue;
	
}//EOM
}

