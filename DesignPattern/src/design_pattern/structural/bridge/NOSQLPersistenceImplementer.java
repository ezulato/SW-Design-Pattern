package design_pattern.structural.bridge;


/**
 * CONCRETE IMPLEMENTATION of CRUD OPERATIONS 
 * */

public class NOSQLPersistenceImplementer implements PersistenceImplementer {

	public void insertData(String id) {
		// write here CREATE OPERATIONS
		System.out.println("NOSQLPersistenceImplementer - CREATE OPERATIONS");
	}
	
	public void readData(String id) {
		// write here READ OPERATIONS
	}
	
	public void updateData(String id) {
		// write here UPDATE OPERATIONS
	}
	
	public void deleteData(String id) {
		// write here DELETE OPERATIONS
	}
	
}
