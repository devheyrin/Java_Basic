package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class FIleReaderWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자 형태로 파일 쓰기
		try {
			FileWriter fw = new FileWriter("test.txt");
			fw.write("아자");
			fw.write("자바자바");
			fw.close();
			
		}catch(IOException e) {
		}
		//문자 형태로 파일 읽어오기
		try {
			FileReader fr = new FileReader("test.txt");
			int a;
				while((a=fr.read()) !=-1) {
				System.out.print((char) a);
			}
		fr.close();
		}catch(IOException e) {
		}
	}
}
