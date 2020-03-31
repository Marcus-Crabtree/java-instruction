
public class SportUtilityVehicle extends Car {
	private boolean thirdRow;
	private boolean offRoadCapable;
	
	//constructors!! must come from car check your class!(line 2)
	public SportUtilityVehicle() {
		super();
	}

	// loaded pull from super to pull in parent variables as well as child
	public SportUtilityVehicle(String make, String model, int year, double mpg, boolean thirdRow,
			boolean offRoadCapable) {
		super(make, model, year, mpg);
		this.thirdRow = thirdRow;
		this.offRoadCapable = offRoadCapable;
	}
	//generate getter and setters
	public boolean isThirdRow() {
		return thirdRow;
	}

	public void setThirdRow(boolean thirdRow) {
		this.thirdRow = thirdRow;
	}

	public boolean isOffRoadCapable() {
		return offRoadCapable;
	}

	public void setOffRoadCapable(boolean offRoadCapable) {
		this.offRoadCapable = offRoadCapable;
	}
//generate toString
	@Override
	public String toString() {
		return super.toString()+"SportUtilityVehicle [thirdRow=" + thirdRow + ", offRoadCapable=" + offRoadCapable + "]";
	}

	@Override
	public String getDisplayText() {
		return make + ", " +model+", " +year;
	}
	
	
	
}
