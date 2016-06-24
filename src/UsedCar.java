
public class UsedCar extends Car {
	
	int miles;

	public UsedCar(String startMake, String startModel, int startYear, double startPrice, int startMiles) {
		super(startMake, startModel, startYear, startPrice);
		miles = startMiles;
	}

	
	public int getMiles() {
		return miles;
	}

	
	public void setMiles(int miles) {
		this.miles = miles;
	}
	
	

}
