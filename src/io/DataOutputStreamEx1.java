package io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {100,95,85,90,75};
		try {
			FileOutputStream fos = new FileOutputStream("score.dat");
			DataOutputStream dos = new DataOutputStream(fos);
			for(int i=0;i<score.length;i++) {
				dos.writeInt(score[i]);
			}
			dos.close();
		}catch(IOException e) {
			
		}
	}

}
