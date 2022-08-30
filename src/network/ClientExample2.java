package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientExample2 {
	
	public static void main(String[] args) {

		Socket socket = null; // 클라이언트와 주고받을 것 
		
		try {
			socket = new Socket("192.168.0.35", 9000); // 보낼주소
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
			
			// 서버에게 전송
			printWriter.println("안녕 서버!");
			printWriter.flush();

			String str = reader.readLine();
			System.out.println(str);
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				socket.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
	
		}
		
	}

}
