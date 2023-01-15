package javaOOP;

public class CarOOP {
	private String carCompany;
	private String carType;
	private String fuelType;
	private Float mileAge;
	private Double carPrice;

	protected String getCarCompany() {
		return carCompany;
	}

	protected void setCarCompany(String carCompany) {
		this.carCompany = carCompany;
	}

	protected String getCarType() {
		return carType;
	}

	protected void setCarType(String carType) {
		this.carType = carType;
	}

	protected String getFuelType() {
		return fuelType;
	}

	protected void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	protected Float getMileAge() {
		return mileAge;
	}

	protected void setMileAge(Float mileAge) {
		this.mileAge = mileAge;
	}

	protected Double getCarPrice() {
		return carPrice;
	}

	protected void setCarPrice(Double carPrice) {
		this.carPrice = carPrice;
	}

	protected void showCarInfor() {
		System.out.println("Car company: " + carCompany);
		System.out.println("Car type: " + carType);
		System.out.println("Car fuel Type: " + fuelType);
		System.out.println("Car mile Age: " + mileAge);
		System.out.println("Car price: " + carPrice);
	}

	public static void main(String[] args) {
		CarOOP toyota = new CarOOP();
		toyota.setCarCompany("Toyota");
		toyota.setCarType("Camry");
		toyota.setFuelType("Diesel");
		toyota.setMileAge(150f);
		toyota.setCarPrice(50000d);
		toyota.showCarInfor();

		CarOOP honda = new CarOOP();
		honda.setCarCompany("Honda");
		honda.setCarType("Accent");
		honda.setFuelType("Petrol");
		honda.setMileAge(150f);
		honda.setCarPrice(50000d);
		honda.showCarInfor();
	}
}
