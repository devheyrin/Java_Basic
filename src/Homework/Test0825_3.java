package Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test0825_3 {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student("홍동우",1,1,100,100,100));
		list.add(new Student("홍다은",1,2,90,70,80));
		list.add(new Student("신영범",1,3,80,80,90));
		list.add(new Student("박희철",1,4,70,90,70));
		list.add(new Student("차건담",1,5,60,100,80));

		Collections.sort(list);

		Iterator it = list.iterator();

		while(it.hasNext())
			System.out.println(it.next());
	}
	
	

}
