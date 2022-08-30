package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCExample1 {
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.67:1521:kibwa", "sky", "pass");
			stmt = conn.createStatement();
			System.out.println("로딩 완료");
			String sql = "select goods_code, goods_name, goods_price, goods_made from goodsinfo";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("상품코드 상품명\t\t 가격 제조사");
			System.out.println("------------------------");
			while (rs.next()) {
				String code = rs.getString("GOODS_CODE");
				String name = rs.getString("GOODS_NAME");
				int price = rs.getInt("GOODS_PRICE");
				String maker = rs.getString("GOODS_MADE");
				System.out.printf("%8s %s \t%12d %s %n", code, name, price, maker);
			}
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
