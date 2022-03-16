package design_pattern.structural.adapter;


/**
 * Supplies power at 220 V.
 * Here, Socket class also acts as the Client class.
 * The power supply is indicated by the volts attribute.
 * */

public class Socket {

	public static void main(String[] args) {
		String volts = "220V";
		System.out.println("Socket: supplying power at :" + volts);
		Adapter adapter = new Adapter ();
		String resp = adapter.connectAdapter(volts);
		System.out.println("Socket: reponse from adapter : " + resp);
		
		

	}

}
