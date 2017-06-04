package exception;

public class CustomerException extends Exception {

	public String errorCode;

	public String errorDescription;
	
	 private Exception exception;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	public CustomerException(String errorCode) {
		this.errorCode = errorCode;
	}
	
	public CustomerException(String errorCode, String errorDescription) {
		this.errorCode = errorCode;
		this.errorDescription = errorDescription;
				
	}
	
	public CustomerException(Exception exception ,String errorCode) {
		this.errorCode = errorCode;
		this.exception=exception;
				
	}
	
	 public static void throwException(String errorCode, String errorMsg) throws CustomerException{
		 
		 CustomerException exception = new CustomerException(errorCode, errorMsg);
		 throw exception;
	 }

}
