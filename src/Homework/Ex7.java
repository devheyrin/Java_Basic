package Homework;

import java.util.Calendar;
import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String fullDate = sc.nextLine();
		int year = Integer.parseInt(fullDate.split("/")[0]);
		int month = Integer.parseInt(fullDate.split("/")[1]);
		int date = Integer.parseInt(fullDate.split("/")[2]);
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, date);
		System.out.println(cal);
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
	
		
	}
	
}

