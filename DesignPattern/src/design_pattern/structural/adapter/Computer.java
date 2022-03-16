package design_pattern.structural.adapter;

/**
 * Can work only at 110 V and cannot be connected to 220V
 * */

public class Computer {

	public String connectComputer(String volts) {
		System.out.println("Computer: received fomr Adapter " 
				+ volts + " volts.");
		if (volts == "110V") 
			return "Computer : connected to the power source." ;
		else 
			return "Computer : not connected to the power source." ;
	}
	
} 

