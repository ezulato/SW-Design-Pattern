package design_pattern.structural.bridge;


/**
 * CRUD OPERATIONS - 
 * insert, read, update, delete
 * 
 * */
public interface PersistenceImplementer {
	
	public void insertData(String id);
	public void updateData(String id);
	public void deleteData(String id);
	public void readData(String id);
	
}
