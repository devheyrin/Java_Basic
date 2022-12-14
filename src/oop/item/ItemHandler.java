package oop.item;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ItemHandler {

	private Item[] myItems;
	private int numOfItems;

	public ItemHandler(int num) {
		myItems = new Item[num];
		numOfItems = 0;
	}

	private void addItemInfo(Item I) {
		myItems[numOfItems++] = I;
	}

	public void addItem(int choice) {
		int itemNo, price, trackNum, runtime, pageNum;
		String title, singer, actor, name, outDate;
		Scanner sc = new Scanner(System.in);

		System.out.println("제품번호: ");
		itemNo = Integer.parseInt(sc.nextLine());
		System.out.println();
		System.out.println("이름: ");
		title = sc.nextLine();
		System.out.println();
		System.out.println("가격: ");
		price = Integer.parseInt(sc.nextLine());

		if (choice == 1) {
			// CD
			System.out.println("가수: ");
			singer = sc.nextLine();
			System.out.println("트랙수: ");
			trackNum = Integer.parseInt(sc.nextLine());
			System.out.println("출고일자: ");
			outDate = sc.nextLine();
			this.addItemInfo(new CDItem(itemNo, title, price, singer, trackNum, outDate));
		} else if (choice == 2) {
			// DVD
			System.out.println("주연배우: ");
			actor = sc.nextLine();
			System.out.println("상영시간: ");
			runtime = Integer.parseInt(sc.nextLine());
			System.out.println("출고일자: ");
			outDate = sc.nextLine();
			this.addItemInfo(new DVDItem(itemNo, title, price, actor, runtime, outDate));
		} else {
			// Book
			System.out.println("저자명: ");
			name = sc.nextLine();
			System.out.println("쪽수: ");
			pageNum = Integer.parseInt(sc.nextLine());
			System.out.println("출고일자: ");
			outDate = sc.nextLine();
			this.addItemInfo(new BookItem(itemNo, title, price, name, pageNum, outDate));
		}
		System.out.println("입력 완료!");
	}

	public void showAllData() {
		for (int i = 0; i < numOfItems; i++) {
			myItems[i].output();
		}
	}

	// myItems 파일 쓰기
	public void writeItems() {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("items.txt"));
			for (int i = 0; i < numOfItems; i++) {
				bw.write(myItems[i].toString());
				bw.newLine();
			}
			bw.flush();
		
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}

	// myItems 파일 읽기
	public void readItems(){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("items.txt"));
			String line = "";
			while (line != null) {
				line = br.readLine();
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
