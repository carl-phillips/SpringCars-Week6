package beans;

public class Car {

	private long id;
	private String make;
	private String model;
	private int year;
	private boolean sold;
	private String carSold;
	
	public Car(){

	}
	
	public Car(long id, String make, String model, int year, boolean sold) {
		this.id = id;
		this.make = make;
		this.model = model;
		this.year = year;
		this.sold = sold;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isSold() {
		return sold;
	}

	public void setSold(boolean sold) {
		this.sold = sold;
	}
	
	public String carSold() {
		if(sold == true) {
			carSold = "Sold";
		} else {
			carSold = "Not Sold";
		}
		return carSold;
	}
}
