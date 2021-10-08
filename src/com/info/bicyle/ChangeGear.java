package com.info.bicyle;

public class ChangeGear implements CycleState {

	Bicycle cycle;
	
	
	
	public ChangeGear(Bicycle cycle) {
		this.cycle = cycle;
	}

	@Override
	public void gearState() {
		// TODO Auto-generated method stub
        System.out.println("Already in gear Mode");
	}

	@Override
	public void changeGear(int gearNumber) {
		// TODO Auto-generated method stub
		if(gearNumber>0) {
			System.out.println("The gear changed to "+gearNumber);
			cycle.setState(cycle.getChangeGear());
		}
		else {
			System.out.println("Gear position is invalid");
		}
	}

	@Override
	public void normalState() {
		// TODO Auto-generated method stub
         System.out.println("Slow down to normal mode");
	}

	@Override
	public void fastMode() {
		// TODO Auto-generated method stub
		System.out.println("Dont try to switch Fast Mode ");
	}

	@Override
	public void slowMode() {
		// TODO Auto-generated method stub
		System.out.println("Dont try to switch Slow Mode ");

	}

}
