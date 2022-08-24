package oop.item;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        ItemHandler itemHandler = new ItemHandler(3);
        ItemLendHandler lendHandler = new ItemLendHandler(3);
        Scanner sc = new Scanner(System.in);

        while (true) {
        	System.out.println("1. 구매");
            System.out.println("2. 대여");
        	int choice = sc.nextInt();
        	
        	if (choice == 1) {
        		System.out.println("1. CD 구매");
                System.out.println("2. DVD 구매");
                System.out.println("3. 책 구매");
                System.out.println("4. 전체 정보 출력");
                System.out.println("5. 프로그램 종료");
                System.out.println("선택 >> ");
   
                choice = sc.nextInt();
                switch (choice) {
                    case 1: case 2: case 3:
                        itemHandler.addItem(choice);
                        break;
                    case 4:
                        itemHandler.showAllData();
                        break;
                    case 5:
                        System.out.println("프로그램을 종료합니다.");
                        return;
                }
        		
        	} else {
        		
        		System.out.println("1. CD 대여");
                System.out.println("2. DVD 대여");
                System.out.println("3. 책 대여");
                System.out.println("4. 전체 대여");
                System.out.println("5. 프로그램 종료");
                System.out.println("선택 >> ");
   
                choice = sc.nextInt();
                switch (choice) {
                    case 1: case 2: case 3:
                    	lendHandler.addLend(choice);
                        break;
                    case 4:
                    	lendHandler.checkOutAll();
                        break;
                    case 5:
                        System.out.println("프로그램을 종료합니다.");
                        return;
                }
        		
        	}
        }
    }
}

