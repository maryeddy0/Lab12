package CarForSale;


public class UsedCar extends Car {
	
	private int mileage;	
	public UsedCar(String string, String string2, String string3, int i, int j) {
		
	}
	
	
	public UsedCar(int mileage, int number) {
		super();
		this.mileage = mileage;
		
	}


	public UsedCar(String make, String model, int year, double price) {
		super(make, model, year, price);}
		
		
	
	public UsedCar(String make, String model, int year, double price, int mileage) {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return String.format(" Make: %-20s Model: %-10s Year: %-10s Price: %-10s, (Used) Mileage: %-10s\n", getMake(), getModel(), getYear(), getPrice(), getMileage());
	}
	
	




	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}



	public void add(UsedCar usedCar) {
		// TODO Auto-generated method stub
		
	}
	
	


	
	
	
	
	
	

}
