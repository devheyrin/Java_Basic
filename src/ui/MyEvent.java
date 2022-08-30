package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyEvent implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		info.setVisible(false); // 다이얼로그 보이지 않게 하기
		info.dispose(); // 메모리에서 제거
		
	}
	
	

}
