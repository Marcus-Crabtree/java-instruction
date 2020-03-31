
public class Die {
//declare instance variable(s)
	private int value;

	public Die() {
		value = 0;
	}

//set constructor
	public Die(int value) {
		this.value = 0;
	}

	public void roll() {

	}

	public int getValue() {
		value = (int) (Math.random() * 6) + 1;
		return value;
	}

}
