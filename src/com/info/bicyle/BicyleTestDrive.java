package com.info.bicyle;

import com.info.builder.Cycle;
import com.info.builder.CycleBuilder;

public class BicyleTestDrive {
	
	
	
	public static void main(String[] args) {
		
		//Builder pattern 
		Cycle MountainCycle = new CycleBuilder().setBrand("Hercules").setType("mountain Bike").
				setPeddalType("manual").getCycle();
		
		Cycle roadCycle = new CycleBuilder().setBrand("Hercules").setType("road Bike").
				setPeddalType("Automatic").getCycle();
		
		System.out.println("Purchase  mountain cycle "+MountainCycle);
		System.out.println("Purchase road Cycle "+roadCycle);

		
		//State pattern to ride bicyle 
		Bicycle bicycle = new Bicycle();
		bicycle.withoutGear();
		bicycle.gearMode();
		bicycle.changeGear(5);
		bicycle.fastMode();
		bicycle.slowMode();
	}

	

}
