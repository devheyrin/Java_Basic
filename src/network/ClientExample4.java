package network;

import java.net.Socket;

public class ClientExample4 {
	public static void main(String[] args) {
		Socket socket = null;
		String myname = "혜린";

		try {
			socket = new Socket("192.168.0.67", 9006); // 보낼주소
			
			Thread sender = new SenderThread4(socket, myname);
			Thread receiver = new ReceiverThread4(socket, myname);

			sender.start();
			receiver.start();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	}

}
