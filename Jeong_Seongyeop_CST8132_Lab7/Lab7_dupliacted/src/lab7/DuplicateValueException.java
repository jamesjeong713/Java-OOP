package lab7;

public class DuplicateValueException extends Exception {						
	private static final long serialVersionUID = 1L;
	// no-argument constructor specifies default error message
	public DuplicateValueException() {									
		super( "Duplicate value exception" );
	}				
	// constructor to allow customized error message 				
	public DuplicateValueException( String message ) {	
		super( message );	// 		
	} // end class NumberNotFoundException 
}
