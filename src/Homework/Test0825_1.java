package Homework;

import java.util.ArrayList;
import java.util.List;

public class Test0825_1 {
	
	public static void main(String[] args) {
		List<Integer> setA = new ArrayList<Integer>();
		List<Integer> setB = new ArrayList<Integer>();
		
		// 집합 A에 요소 추가 
		setA.add(1);
		setA.add(2);
		setA.add(3);
		setA.add(4);
		// 집합 B에 요소 추가
		setB.add(3);
		setB.add(4);
		setB.add(5);
		setB.add(6);
		
		// 교집합 
//		setA.retainAll(setB);
//		System.out.println("교집합: " + setA);
		
		// 차집합 
		// A - B 
//		setA.removeAll(setB);
//		System.out.println("A - B 차집합: " + setA);
		// B - A
		//setB.removeAll(setA);
		//System.out.println("B - A 차집합: " + setB);
		
		// 합집합
		setA.removeAll(setB); // 1. A - B 차집합 구하기 
		setB.addAll(setA); // 2. B 에 A-B차집합 더하기 
		System.out.println("합집합" + setB);
		
		
	}
	
	
	
}
