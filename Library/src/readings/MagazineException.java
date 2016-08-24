package readings;

public class MagazineException extends Exception {

	private String msg;
	
	public MagazineException(String string) {
		this.msg=string;
	}
	
	@Override
	public String getMessage() {
		return msg;
	}

}
