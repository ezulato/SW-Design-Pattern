package design_pattern.structural.adapter;


/**
 * This interface helps to create an adapter
 * that converts from input volts -> to output volts.
 * The voltageAdapter() method
 * receives the input volts from Socket and 
 * return an output volt that is required by the computer. 
 * 
 * */


public interface Target {
	public String connectAdapter(String volts) ;
}
