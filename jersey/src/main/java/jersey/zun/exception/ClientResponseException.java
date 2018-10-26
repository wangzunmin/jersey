package jersey.zun.exception;

public class ClientResponseException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9049658392489904200L;
	private Object data = null;
	private int resultCode;

	public ClientResponseException(int resultCode, String message, Object data) {
		super(message);
		this.resultCode = resultCode;
		this.data = data;
	}

	public ClientResponseException(String message) {
		super(message);
	}

	/** * @return the resultCode */
	public int getResultCode() {
		return resultCode;
	}

	/** * @param returnCode the resultCode to set */
	public void setresultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	/** * @return the data */
	public Object getData() {
		return data;
	}

	/** * @param data the data to set */
	public void setData(Object data) {
		this.data = data;
	}

}
