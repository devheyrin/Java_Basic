package ui;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogEventTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Parent");
		f.setSize(300, 200);
		
		final Dialog info = new Dialog(f, "information", true); 
		info.setSize(140, 90);
		info.setLocation(50, 50);
		info.setLayout(new FlowLayout());
		
		// 컴포넌트 만들기 
		Label msg = new Label("이것은 모달 다이얼로그", Label.CENTER);
		Button ok = new Button("오케이");
		
		// MyEvent my = new MyEvent();
		// ok.addActionListener(my); //ok 버튼에 이벤트리스너 달기 
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				info.setVisible(false);
				info.dispose();
			}
		});
		
		info.add(msg);
		info.add(ok);
		
		
		f.setVisible(true);
		info.setVisible(true);
		

	}

}
