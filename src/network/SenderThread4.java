package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SenderThread4 extends Thread{
	
	Socket socket;
	String name; 
	
	public SenderThread4(Socket socket, String name) {
		this.socket = socket;
		this.name = name;
	}
	
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			// 키보드로부터 입력받아 보내기 
			PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
			while (true) {
				String str = reader.readLine();
				if (str.equals("바이"))
					break;
				printWriter.println(str);
				printWriter.flush();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
