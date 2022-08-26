package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx {
	
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("123.txt");
			
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			// 크기가 5개이기때문에 5개 모아서 한번에 보냄. 5개가 안 모이면 보내지 않음 
			// 입출력 성능을 높일 수 있다. 
			
			for(int i='1'; i<='9';i++) {
				bos.write(i);
			}
			fos.close();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

}
