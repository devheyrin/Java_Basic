package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample2 {

	public static void main(String[] args) {

		ServerSocket serverSocket = null; // 서버 서비스하는 클래스
		Socket socket = null; // 클라이언트와 주고받을 것

		try {
			serverSocket = new ServerSocket(9000);
			socket = serverSocket.accept(); // 클라이언트가 요청하면 동의하겠다
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
			
			String str = reader.readLine();
			System.out.println(str);
			
			printWriter.println("안녕 클라이언트!ㅎㅎ");
			printWriter.flush();

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				socket.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				serverSocket.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
