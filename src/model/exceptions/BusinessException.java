package model.exceptions;

public class BusinessException extends RuntimeException{
	
	/**
	 * Serial Version is optional
	 */
	private static final long serialVersionUID = 1L;

	public BusinessException(String msg) {
		super(msg);
	}

}
