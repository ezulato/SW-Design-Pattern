package design_pattern.structural.bridge;


/***
 * TOTAL ABSTRACTION
 * This interface abstracts the persistence or saving of
 * the data using different methods.
 * */
public interface Persistence {
	
	public void persist(String id);

}
