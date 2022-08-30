package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample2 {
	public static void main(String[] args) {
		
		if (args.length != 4) {
			System.out.println("입력예시 : java JDBCExample2 [상품코드 상품명 가격 제조사]");
			return;
		}
		
		Connection conn = null;
		Statement stmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.67:1521:kibwa", "sky", "pass");
			stmt = conn.createStatement();
			
			String sql = "insert into goodsinfo(goods_code, goods_name, goods_price, goods_made) values(" + 
						  args[0] + ", '" + 
						  args[1] + "'," + 
						  args[2] + ", '" +
						  args[3] + "')";
			
			int rowNum = stmt.executeUpdate(sql);
			System.out.println(rowNum + "행이 추가되었습니다");
			
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("디비 라이브러리 없음");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("SQL명령이 잘못됨");
		} finally {
			try {
				stmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
