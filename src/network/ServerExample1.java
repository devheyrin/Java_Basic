package network;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

// 서버 
public class ServerExample1 {

	public static void main(String[] args) {
		ServerSocket serverSocket = null; // 서버 서비스하는 클래스
		Socket socket = null; // 클라이언트와 주고받을 것  
		
		try {
			 serverSocket = new ServerSocket(9000);
			 socket = serverSocket.accept(); // 클라이언트가 요청하면 동의하겠다 
			 InputStream in = socket.getInputStream();
			 OutputStream out = socket.getOutputStream();
			 
			 byte[] arr = new byte[100];
			 in.read(arr);
			 System.out.println(new String(arr)); // 클라이언트가 보낸것을 출력
			 
			 String str = "Hello! JM"; 
			 out.write(str.getBytes()); // 클라이언트에게 보내기 
			
		} catch (Exception e) {
			e.printStackTrace();
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
