package caicedo.com.exceptionsS15;

public class GenericException extends Exception {
	
	public GenericException(String msj) {
		super(msj);
	}
	
	public GenericException(String msj, Throwable source) {
		super(msj, source);
	}
}
