package ibm.com.exception;

public class MyException extends Exception {
	
	private String message;
	MyException(String message){
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
}
