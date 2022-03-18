package design_pattern.structural.bridge;


/**
 * CONCRETE IMPLEMENTATION of CRUD OPERATIONS 
 * Provides the SQL Persistence Implementation using SQL Statements.
 * */
public class SQLPersistenceImplementer implements PersistenceImplementer {

	@Override
	public void insertData(String id) {
		// write here CREATE OPERATIONS
		System.out.println("SQLPersistenceImplementer- CREATE OPERATIONS");
	}
	
	@Override
	public void readData(String id) {
		// write here READ OPERATIONS
	}
	
	@Override
	public void updateData(String id) {
		// write here UPDATE OPERATIONS
	}
	
	@Override
	public void deleteData(String id) {
		// write here DELETE OPERATIONS
	}

}
