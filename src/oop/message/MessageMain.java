package oop.message;

public class MessageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SMSSender sms1 = new SMSSender("생일을 축하합니다", "고객센터", "010-1111-1111", "할인쿠폰이 발송되었습니다.");
		EmailSender email1 = new EmailSender("생일을 축하합니다", "고객센터", "aaa@gmail.com", "할인쿠폰이 발송되었습니다.");
		
		sms1.sendMessage("010-1234-0808");
		email1.sendMessage("abc0808@gmail.com");
		sms1.sendMessage("010-2222-0913");

	}

}
