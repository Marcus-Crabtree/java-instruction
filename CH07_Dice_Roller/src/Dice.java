
public class Dice {

	private Die die1;
	private Die die2;

	public Dice() {
		super();
		this.die1 = new Die();
		this.die2 = new Die();

	}

	public int getDie1Value() {
		return this.die1.getFaceValue();
	}

	public int getDie2Value() {
		return this.die2.getFaceValue();
	}

	public int getSum() {
		return this.getDie1Value() + this.getDie2Value();
	}

}
