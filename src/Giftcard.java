
public class Giftcard {
	
	private String sender;
	private String receiver;
	private String message;
	
	public Giftcard(String sender, String receiver, String message) {
		this.sender = sender;
		this.receiver = receiver;
		this.message = message;
	}
	
	public String getMsg() {
		return this.message;
	}
	
}
