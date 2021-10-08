package com.info.builder;

public class Cycle {

	private String brand;
	private String type;
	private String peddalType;
	
	public Cycle(String brand, String type, String peddalType) {
		super();
		this.brand = brand;
		this.type = type;
		this.peddalType = peddalType;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPeddalType() {
		return peddalType;
	}

	public void setPeddalType(String peddalType) {
		this.peddalType = peddalType;
	}

	@Override
	public String toString() {
		return "Cycle [brand=" + brand + ", type=" + type + ", peddalType=" + peddalType + "]";
	}
	
	
	
}
