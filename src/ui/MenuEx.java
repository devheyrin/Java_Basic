package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MenuEx extends JFrame implements ActionListener {
	// 멤버 변수 선언
	JMenuBar mb;

	JMenu mFile;
	JMenu mHelp;

	JMenuItem miNew;
	JMenuItem miOpen;
	JMenuItem miSave;
	JMenuItem miExit;

	JMenuItem miInfo;

	JFileChooser fc;

	MenuEx() {
		super("Menu Test");
		// 멤버 변수 초기화
		mb = new JMenuBar();

		mFile = new JMenu("File"); // 메뉴
		mHelp = new JMenu("Help");

		miNew = new JMenuItem("New"); // 메뉴의 항목
		miOpen = new JMenuItem("Open");
		miSave = new JMenuItem("Save");
		miExit = new JMenuItem("Exit");

		miInfo = new JMenuItem("Info");

		fc = new JFileChooser();
	}

	// 화면 구성 메소드
	void display() {
		// 메뉴 구성
		mb.add(mFile);
		mb.add(mHelp);

		// 메뉴별 서브메뉴 구성
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.addSeparator();
		mFile.add(miExit);

		mHelp.add(miInfo);

		// 메뉴바 설정
		setJMenuBar(mb);
		// 프레임 크기 설정
		setSize(400, 300);
		// 종료 버튼 이벤트 설정
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 프레임 표시
		setVisible(true);
	}

	// 이벤트 설정 메소드
	void eventProcess() {
		miOpen.addActionListener(this);

		miSave.addActionListener(this);
		miExit.addActionListener(this);
		miInfo.addActionListener(this);

	}

	// 이벤트리스너가 감지한 이벤트를 e 로 넘겨주면서 호출
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == miOpen) {
			// Open이 클릭된 경우
			fc.showOpenDialog(this);
		} else if (e.getSource() == miSave) {
			fc.showSaveDialog(this);
		} else if (e.getSource() == miExit) {
			System.exit(0);
		} else if (e.getSource() == miInfo) {
			JOptionPane.showMessageDialog(this,  "작성자: 홍동우");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuEx frm = new MenuEx();
		frm.display();
		frm.eventProcess();

	}

}
