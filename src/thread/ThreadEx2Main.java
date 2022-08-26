package thread;

import javax.swing.JOptionPane;

public class ThreadEx2Main {
	public static void main(String[] args) {
		ThreadEx2 th = new ThreadEx2();
		th.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력: ");
		System.out.println("입력한 값은 " + input);
		
		/*
		 * 10 // th 실행흐름 
			9 
			8
			7
			입력한 값은 1 // main 실행흐름 
			6
			5
			4
			3
			2
			1
		 */
		
	}

}
