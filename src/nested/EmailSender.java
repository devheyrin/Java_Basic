package nested;

public class EmailSender extends MessageSender {
	String sender;
	String receiver;
	
	public EmailSender(String sender, String receiver) {
		// TODO Auto-generated constructor stub
		this.sender = sender;
		this.receiver = receiver;
	}

	@Override
	void send(String message) {
		// TODO Auto-generated method stub
		System.out.println("보내는사람: " + sender);
		System.out.println("받는 사람: " + receiver);
		System.out.println("내용: " + message);
		System.out.println();
	} 
	
}
