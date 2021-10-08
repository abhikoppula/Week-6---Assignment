package com.info.bicyle;

public class Slowmode implements CycleState {

	Bicycle cycle;
	
	
	
	public Slowmode(Bicycle cycle) {
		super();
		this.cycle = cycle;
	}

	@Override
	public void gearState() {
		// TODO Auto-generated method stub
         System.out.println("Gear should be minimum ");
	}

	@Override
	public void changeGear(int gearNumber) {
		// TODO Auto-generated method stub
		System.out.println("Dont change the gear during the slowMode");
	}

	@Override
	public void normalState() {
		// TODO Auto-generated method stub
        System.out.println("Dont try to make the normal state ");
	}

	@Override
	public void fastMode() {
		// TODO Auto-generated method stub
        System.out.println("Switch to fastmode when the road is free");
       
	}

	@Override
	public void slowMode() {
		// TODO Auto-generated method stub
		 System.out.println("You are in slowMode ");
		 cycle.setState(cycle.getSlowMode());
	}


}
