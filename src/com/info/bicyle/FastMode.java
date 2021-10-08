package com.info.bicyle;

public class FastMode implements CycleState {

	Bicycle cycle;
	
	
	public FastMode(Bicycle cycle) {
		super();
		this.cycle = cycle;
	}

	@Override
	public void gearState() {
		// TODO Auto-generated method stub
         System.out.println("Gear should be maximum ");
	}

	@Override
	public void changeGear(int gearNumber) {
		// TODO Auto-generated method stub
		System.out.println("Dont change the gear during the fastMode");
	}

	@Override
	public void normalState() {
		// TODO Auto-generated method stub
        System.out.println("Dont try to make the normal state ");
	}

	@Override
	public void fastMode() {
		// TODO Auto-generated method stub
        System.out.println("Its in fastMode ");
        cycle.setState(cycle.getFastMode());
	}

	@Override
	public void slowMode() {
		// TODO Auto-generated method stub
		 System.out.println("Switch to slowMode when you find obstacles ");
	}

}
