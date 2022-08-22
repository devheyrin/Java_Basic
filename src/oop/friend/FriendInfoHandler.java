package oop.friend;

import java.util.Scanner;

public class FriendInfoHandler {
	private Friend[] myFriends;
	// 왜 Friend 인가? - 어떤 타입의 친구일지 모르기 때문 
	// -> 상속 구조를 사용하는 이유 : 자식은 부모 타입으로 치환가능하기 때문! 
	
	private int numOfFriends; // 친구 배열 크기 
	
	public FriendInfoHandler(int num) {
		myFriends = new Friend[num];
		numOfFriends = 0;
	}
	
	// 배열에 친구 추가 메소드 
	private void addFriendInfo(Friend fren) {
		myFriends[numOfFriends++] = fren;
		// 배열에 친구 추가 후 친구 수 +1 
	}
	
	public void addFriend(int choice) {
		String name, phoneNum, addr, work, major;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: "); name = sc.nextLine();
		System.out.print("전화: "); phoneNum = sc.nextLine();
		System.out.print("주소: "); addr = sc.nextLine();
		
		if (choice == 1) {
			System.out.print("직업: "); work = sc.nextLine();
			this.addFriendInfo(new HighFriend(name, phoneNum, addr, work));
		} else {
			System.out.print("전공: "); major = sc.nextLine();
			this.addFriendInfo(new UnivFriend(name, phoneNum, addr, major));
		}
		System.out.println("입력 완료!");
		
	}
	
	// 친구 배열의 모든 데이터를 출력하는 메소드
	public void showAllData() {
		// 반복 
		for (int i=0; i<numOfFriends; i++) {
			myFriends[i].showData();
		}
		
	}
	
	// 친구 배열의 간략정보만 출력하는 메소드 
	public void showAllSimpleData() {
		// 반복 
		for (int i=0; i<numOfFriends; i++) {
			myFriends[i].showBasicInfo();
		}
	}

}
