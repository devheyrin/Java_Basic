package oop.message;

abstract public class MessageSender {
	String title, senderName;
	
	public MessageSender(String title, String senderName) {
		this.title = title;
		this.senderName = senderName;
	}
	
	abstract void sendMessage(String rec);

}
