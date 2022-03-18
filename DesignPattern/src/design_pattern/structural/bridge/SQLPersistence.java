package design_pattern.structural.bridge;

/**
 * This class implements Persistence abstraction for
 * SQL persistence implementation.
 * Uses SQL commands for persisting the data
 * */
public class SQLPersistence {
	
	SQLPersistenceImplementer s = new SQLPersistenceImplementer();
	
	void persist(String id) {
		// call appropriate persistence operation
		s.insertData(id);
	}

}
