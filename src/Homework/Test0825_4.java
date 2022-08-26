package Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test0825_4 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student2("홍동우", 2, 1, 70, 90, 70));
		list.add(new Student2("홍다은", 2, 2, 60, 100, 80));
		list.add(new Student2("채혜광", 1, 3, 100, 100, 100));
		list.add(new Student2("이혜지", 1, 1, 90, 70, 80));
		list.add(new Student2("이종세", 1, 2, 80, 80, 90));
		Collections.sort(list, new BanNoAscending());
		Iterator it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

}
