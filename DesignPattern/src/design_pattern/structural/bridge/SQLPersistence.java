package design_pattern.structural.bridge;

/**
 * This class implements Persistence abstraction for
 * SQL persistence implementation.
 * Uses SQL commands for persisting the data
 * */
public class SQLPersistence implements Persistence {
	
	SQLPersistenceImplementer s = new SQLPersistenceImplementer();
	
	public void persist(String id) {
		// call appropriate persistence operation
		s.insertData(id);
	}

}
