package network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample1 {

	public static void main(String[] args) {
		Socket socket = null;

		try {
			socket = new Socket("192.168.0.35", 9000); // 보낼주소
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			
			// 서버에게 쓰기 
			String str = "Hello Server!";
			out.write(str.getBytes());

			// 서버로부터 온 메시지 읽기 
			byte[] arr = new byte[100];
			in.read(arr);
			System.out.println(new String(arr));

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
