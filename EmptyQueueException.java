package cs240_hwk2;

public class EmptyQueueException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public EmptyQueueException(String message) {
		super(message);
	
	}
	
	public EmptyQueueException() {
		super();
	
	}

}
