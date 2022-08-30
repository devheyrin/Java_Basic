package network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample3 {
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null; // 서버 서비스하는 클래스
		Socket socket = null; // 클라이언트와 주고받을 것  
		
		try {
			 serverSocket = new ServerSocket(5000);
			 socket = serverSocket.accept(); // 클라이언트가 요청하면 동의하겠다 
			 
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
