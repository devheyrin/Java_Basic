package ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

// 화면 관리 클래스 
public class UIForm extends JFrame {

	JTextArea ta;
	JButton bSave, bLoad, bClear;

	UIForm() {
		ta = new JTextArea();
		bSave = new JButton("파일저장");
		bLoad = new JButton("파일읽기");
		bClear = new JButton("화면지우기");
	}

	void addLayout() {
		JPanel pCenter = new JPanel();
		pCenter.setLayout(new BorderLayout());
		pCenter.add("Center", ta);

		JPanel pSouth = new JPanel();
		pSouth.add(bSave);
		pSouth.add(bLoad);
		pSouth.add(bClear);

		getContentPane().add("Center", pCenter);
		getContentPane().add("South", pSouth);

		setSize(400, 350);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	void eventProc() {
		// "파일저장" 버튼이 눌렸을 때
		bSave.addActionListener(new ActionListener() { // 이름없는 클래스 시작
			public void actionPerformed(ActionEvent ev) {

				JFileChooser fd = new JFileChooser();
				int returnValue = fd.showSaveDialog(null);
				if (returnValue == JFileChooser.APPROVE_OPTION) {
					File f = fd.getSelectedFile();
					String filePath = f.getPath();

					try {
						FileWriter out = new FileWriter(filePath);
						out.write(ta.getText());
						out.close();
					} catch (IOException ex) {
					}
				}
			}
		});

		bLoad.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fd = new JFileChooser();
				int returnValue = fd.showOpenDialog(null);
				if (returnValue == JFileChooser.APPROVE_OPTION) {
					File file = fd.getSelectedFile();
					String filePath = file.getPath();
					try {
						FileReader in = new FileReader(filePath);
						// 여기서 파일 읽어서 ta.append();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

			}
		});

	}
}
