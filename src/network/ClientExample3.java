package network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample3 {

	public static void main(String[] args) {
		Socket socket = null;

		try {
			socket = new Socket("192.168.0.35", 9001); // 보낼주소

			Thread sender = new SenderThread(socket);
			Thread receiver = new ReceiverThread(socket);

			sender.start();
			receiver.start();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	}

}
