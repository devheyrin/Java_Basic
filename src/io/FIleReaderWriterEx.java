package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class FIleReaderWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ���·� ���� ����
		try {
			FileWriter fw = new FileWriter("test.txt");
			fw.write("����");
			fw.write("�ڹ��ڹ�");
			fw.close();
			
		}catch(IOException e) {
		}
		//���� ���·� ���� �о����
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
