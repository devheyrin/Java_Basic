package io;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int score = 0;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis=new FileInputStream("score.dat");
			dis=new DataInputStream(fis);
					while(true) {
//			DataInputStream dis = new DataInputStream(new FileInputStream("score.dat"));
//			while(true) {
				//정수를 읽어오기, 출력, 총점에 누적
						score = dis.readInt();
						System.out.println(score);
						sum += score;
			}
		}catch(EOFException e) {
			System.out.println("점수의 총 합은 : " + sum + "점 입니다.");
		}catch(IOException e) {
		}finally {
			try {
				if(dis!=null)
					dis.close();
			}catch(IOException ie) {
				
			}
		}
	}

}
