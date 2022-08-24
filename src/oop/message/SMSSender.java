package oop.message;

public class SMSSender extends MessageSender {
	String senderPhoneNo, message;
	
	public SMSSender(String title, String senderName, String senderPhoneNo, String message) {
		super(title, senderName);
		this.senderPhoneNo = senderPhoneNo;
		this.message = message;
	}
	
	// 상속받은 메소드를 오버라이딩 
	void sendMessage(String rec) {
		System.out.println("--------------------");
		System.out.println("제목 : " + title);
		System.out.println("보내는 사람 : " + senderName);
		System.out.println("전화번호 : " + rec );
		System.out.println("회신번호 : " + senderPhoneNo);
		System.out.println("메시지 : " + message);
	}

}
