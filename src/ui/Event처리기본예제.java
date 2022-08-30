package ui;

import java.awt.event.*;
import java.awt.*;

// 2. 이벤트 클래스 선언
class  ActionEventClass implements ActionListener {
	public void actionPerformed(ActionEvent e) 
	{
		System.out.println("이벤트 실행");
		System.out.println(e.getActionCommand());

	}
}
------------------------------------------------------------
import java.awt.event.*;
import java.awt.*;

class EventTest
{
	public static void main(String[] args) 
	{
		Frame fm = new Frame("버튼연습");
		fm.setBounds(120,120,250,150);
		fm.setLayout(new FlowLayout());

		Button btn1 = new Button("버튼하나");
		Button btn2 = new Button("버튼두울");

/*   1. 클래스를 외부에 선언 -> 
		ActionListener actlis = new ActionEventClass();		// 3. 선언하고 오버라이딩 해놓은 이벤트 클래스 객체 생성

*/

/*	 2. ActionListener a = 
				new ActionEventClass() {
					public void actionPerformed(ActionEvent e){
						System.out.println("이벤트 실행");
						}
					};
		btn1.addActionListener(a);
		btn2.addActionListener(a);
*/
/*   3.	btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) { 
					System.out.println("이벤트 실행");
					System.out.println(e.getActionCommand());
				}
		});
*/
		fm.add(btn1);
		fm.add(btn2);

		fm.setVisible(true);

	}
}
