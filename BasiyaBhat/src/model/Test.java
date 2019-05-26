package model;

public class Test {
	private int id;
	private String name;
	private String category;
	private String unit;
	private double price;
	private int noOfDaysToDeliver;
	
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Test(int id, String name, String category, String unit, double price, int noOfDaysToDeliver) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.unit = unit;
		this.price = price;
		this.noOfDaysToDeliver = noOfDaysToDeliver;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNoOfDaysToDeliver() {
		return noOfDaysToDeliver;
	}

	public void setNoOfDaysToDeliver(int noOfDaysToDeliver) {
		this.noOfDaysToDeliver = noOfDaysToDeliver;
	}
	
	
	
}
