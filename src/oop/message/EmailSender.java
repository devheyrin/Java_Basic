package oop.message;

public class EmailSender extends MessageSender {
	String senderEmail, message;
	
	public EmailSender(String title, String senderName, String senderEmail, String message) {
		super(title, senderName);
		this.senderEmail = senderEmail;
		this.message = message;
	}
	
	void sendMessage(String rec) {
		System.out.println("--------------------");
		System.out.println("제목 : " + title);
		System.out.println("보내는 사람 : " + senderName + " 이메일 주소" + senderEmail);
		System.out.println("전화번호 : " + rec );
		System.out.println("메시지 : " + message);
	}

}
