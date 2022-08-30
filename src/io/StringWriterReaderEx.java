package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StringWriterReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		BufferedWriter out = new BufferedWriter(new FileWriter("String.txt"));
		out.write("물가 인상 - 국민 농심도 올린다.");
		out.newLine();        //라인 스킵
		out.write("농심도 추석을 지나면 11.3% 인상한다고 발표했다.");
		out.newLine();
		out.write("기사 제목 및 보도자료");
		out.newLine();
		out.write("proneter@new.co.kr");
		out.newLine();
		out.close();
		System.out.println("기사 입력 완료");
		
		//라인단위로 읽어오는건 readLine
	} catch(IOException e) {
	}
		try {
			BufferedReader in = new BufferedReader(new FileReader("String.txt"));
			String a;
			while(true) {
				a = in.readLine();			
				if(a==null)
					break;
				System.out.println(a);
			}
			in.close();
		}catch(IOException e) {
		}
}
}
