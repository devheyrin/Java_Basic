package network;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample4 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(9006);
			while (true) {
				Socket socket = serverSocket.accept(); // 여러명의 요청을 받기 위해 
				Thread thread = new PerClientThread(socket);
				thread.start();
		
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
