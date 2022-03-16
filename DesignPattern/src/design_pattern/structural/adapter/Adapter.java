package design_pattern.structural.adapter;

/**
 * The Adapter class connecting computer to the socket 
 * converting the voltage.
 * */

public class Adapter implements Target {
	
	public String connectAdapter(String volts) {
		System.out.println("Adpter: Receives " + volts + " volts input.");
		Computer computer = new Computer() ;
		String resp = "";
		if (volts == "220V") {
			System.out.println("Adapter: Converting the voltage...");
			volts = "110V";
			System.out.println("Adapter: Output of the Adapter is " + volts);
		}
		else if (volts == "110V") {
			System.out.println("Adapter: Output of the Adapter is " + volts);
		}
		else {
			resp = "Adapter: Cannot be connected. Out of range.";
			resp += "Incompatible Voltate: " + volts;
			return resp;
		}
		resp = computer.connectComputer(volts);
		return resp;
	}

}
