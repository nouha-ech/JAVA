package partie2;

class NegativePriceException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativePriceException(String message) {
        super(message);
    }
}
