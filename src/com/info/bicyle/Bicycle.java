package com.info.bicyle;

public class Bicycle {
	
	CycleState withGear;
	
	CycleState noGear;

	CycleState changeGear;
	
	CycleState slowMode;
	
	CycleState fastMode;
	
	CycleState state;
	
	
	int noOfGear=6;
	
	public Bicycle() {
		withGear = new WithGear(this);
		noGear = new NoGear(this);
		changeGear = new ChangeGear(this);
		slowMode = new Slowmode(this);
		fastMode = new FastMode(this);
		
		state=withGear;
		
		if(noOfGear<0) {
			state=noGear;
		}
	}

	//getters and setters
	public CycleState getWithGear() {
		return withGear;
	}

	public void setWithGear(CycleState withGear) {
		this.withGear = withGear;
	}

	public CycleState getNoGear() {
		return noGear;
	}

	public void setNoGear(CycleState noGear) {
		this.noGear = noGear;
	}

	public CycleState getChangeGear() {
		return changeGear;
	}

	public void setChangeGear(CycleState changeGear) {
		this.changeGear = changeGear;
	}

	public CycleState getState() {
		return state;
	}

	public void setState(CycleState state) {
		this.state = state;
	}

	public int getNoOfGear() {
		return noOfGear;
	}

	public void setNoOfGear(int noOfGear) {
		this.noOfGear = noOfGear;
	}
	
	
	
   public CycleState getSlowMode() {
		return slowMode;
	}

	public void setSlowMode(CycleState slowMode) {
		this.slowMode = slowMode;
	}

	public CycleState getFastMode() {
		return fastMode;
	}

	public void setFastMode(CycleState fastMode) {
		this.fastMode = fastMode;
	}

	//Methods
	public void changeGear(int gearPosition) {
		state.changeGear(gearPosition);
	}
	
	public void withoutGear() {
		state.normalState();
	}
	
	public void gearMode() {
		state.gearState();
	}
	
	public void slowMode() {
		state.slowMode();
	}
	
	public void fastMode() {
		state.fastMode();
	}
	
	
	
	

}
