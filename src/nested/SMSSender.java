package nested;

public class SMSSender extends MessageSender{
	String senderPhoneNo;
	String receiverPhoneNO;
	
	public SMSSender(String senderPhoneNo, String receivePhoneNo) {
		this.senderPhoneNo = senderPhoneNo;
		this.receiverPhoneNO = receivePhoneNo;
	}
	
	@Override
	void send(String message) {
		// TODO Auto-generated method stub
		System.out.println("보내는사람: " + senderPhoneNo);
		System.out.println("받는 사람: " + receiverPhoneNO);
		System.out.println("내용: " + message);
		System.out.println();
		
	}

}
