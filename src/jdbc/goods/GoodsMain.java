package jdbc.goods;

import java.sql.SQLException;

public class GoodsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodsDAO dao = new GoodsDAO("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:@192.168.0.67:1521:kibwa","sky","pass");
		dao.connect();
		System.out.println("DB 연결!!");
		
		try {
			// 1.
			/*
			 * GoodsInfo info = new GoodsInfo(10007, "mp3", 150000, "apple"); int rowNum =
			 * dao.insert(info); System.out.println(rowNum + "행이 입력되었습니다!");
			 */
			
			// 2.
			/*
			 * int rowNum=dao.update(10001, "평면티비");
			 * System.out.println(rowNum+"행이 갱신되었습니다");
			 */
//			
//			// 3.
			/*
			 * int rowNum=dao.update(10001,"평면티비",123456);
			 * System.out.println(rowNum+"행이 갱신되었습니다.");
			 */
//			
//			// 4.
			/*
			 * int rowNum=dao.update(10001,"벽걸이티비", 654321, "이마트");
			 * System.out.println(rowNum+"행이 갱신되었습니다");
			 */
//			
//			// 5.
//			int rowNum=dao.select("전자사전");
//			System.out.println(rowNum+"행이 검색되었습니다");
//
//			//6.
//			GoodsInfo info = dao.select(10001);
//			System.out.println(info);
//		
//			// 7.
//			int rowNum=dao.delete(10007,"mp3");
//			System.out.println(rowNum+"행이 검색되었습니다.-7번");
			
			// 8.
			 GoodsList list=dao.select(); 
			 list.printList();

			
		}catch (SQLException e) {
			// TODO: handle exception
		}
		dao.close();
		System.out.println("DB 연결 해제!!");

		

	}

}
