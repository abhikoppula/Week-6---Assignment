package com.info.builder;

public class CycleBuilder {
	
	private String brand;
	private String type;
	private String peddalType;
	
	
	public CycleBuilder setBrand(String brand) {
		this.brand = brand;
		return this;
	}
	public CycleBuilder setType(String type) {
		this.type = type;
		return this;
	}
	public CycleBuilder setPeddalType(String peddalType) {
		this.peddalType = peddalType;
		return this;
	}
	
	public Cycle getCycle() {
		return new Cycle(brand, type, peddalType);
	}
	

}
