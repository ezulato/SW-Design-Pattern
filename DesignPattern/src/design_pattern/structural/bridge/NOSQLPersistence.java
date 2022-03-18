package design_pattern.structural.bridge;


/**
 * This class persist using NoSQL technology, which is different
 * from the RDBMS theme.
 * */
public class NOSQLPersistence {

	NOSQLPersistenceImplementer n = new NOSQLPersistenceImplementer();
	
	@Override
	void persist(String id) {
		n.insertData(id);
	}

}
