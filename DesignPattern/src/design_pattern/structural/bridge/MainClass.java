package design_pattern.structural.bridge;


/**
 * @author Credits: https://www.guvi.in/courses-video?course=designPatternEng#
 * 
 * 
 * MainClass is the client class.
 * It can implement both the Persistence Models and NO SQL Persistence.
 * Implement the other persistence operations suche as delete, search, edit
 * in a similar way, to realize the potential od this design pattern.
 *
 **/
public class MainClass {

	public static void main(String[] args) {
		SQLPersistence s = new SQLPersistence();
		s.persist("123") ;
		
		NOSQLPersistence n = new NOSQLPersistence();
		n.persist("456") ;
	}

}
