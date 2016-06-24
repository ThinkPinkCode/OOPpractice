
public class Car{
	String make;
	String model;
	int year;
	double price; 
	
	public Car (String startMake, String startModel, int startYear, double startPrice){
		make = startMake;
		model = startModel;
		year = startYear;
		price = startPrice;
	}
	
	public int getMiles() {
		return 0;
	}
	
	public String getMake() {
		return make;
	}


	public String getModel() {
		return model;
	}


	public int getYear() {
		return year;
	}


	public double getPrice() {
		return price;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	

}
