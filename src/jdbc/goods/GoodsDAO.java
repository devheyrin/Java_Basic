package jdbc.goods;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GoodsDAO {
	private Connection conn;
	private	Statement stmt;
	private PreparedStatement pstmt;
	private String driver ;
	private String jdbc_url;
	private String db_id ;
	private String db_pwd;

		public GoodsDAO(){
		}

		public GoodsDAO(String driver, String jdbc_url, String db_id, String db_pwd){
			this.driver=driver;
			this.jdbc_url=jdbc_url;
			this.db_id=db_id;
			this.db_pwd=db_pwd;
		}
		
		public void connect(){
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(jdbc_url, db_id, db_pwd);
			stmt = conn.createStatement();
			//System.out.println("성공적으로 디비에 접속 되었음");
		}catch(ClassNotFoundException e){
			System.out.println("해당 드라이버를 찾을 수 없습니다.1");
		}
		catch(SQLException se){
			System.out.println("해당 드라이버를 찾을 수 없습니다.2");
		}
	}
		
		// 1. 상품입력 메소드
		public int insert(GoodsInfo info) throws SQLException{
			GoodsList list = new GoodsList();
			int rowNum;
			rowNum = stmt.executeUpdate(
					"insert into goodsinfo(goods_code, goods_name, goods_price, goods_made) values("+
					info.getGoodsCode()+",'"+
					info.getGoodsName()+"', "+
					info.getGoodsPrice()+", '"+
					info.getGoodsMaker()+"')");
			list.addGoods(info);
			return rowNum;
		}
		
		// 2. 상품코드에 해당되는 상품명을 수정하는 메소드 
		public int update(int goodsCode, String goodsName) throws SQLException{
			int rowNum;
			rowNum = stmt.executeUpdate(
					"update goodsinfo set goods_name = '"+ goodsName +"' where goods_code = "+ goodsCode);
			return rowNum;
		}
		
		// 3. 상품코드와 상품명이 일치하는 상품의 가격을 수정하는 메소드
		public int update(int goodsCode, String goodsName, int goodsPrice) throws SQLException{
			int rowNum;
			rowNum = stmt.executeUpdate(
					"update goodsinfo set goods_price=" + goodsPrice + " where goods_code = " + goodsCode + " and goods_name = '" + goodsName + "'");
		
			return rowNum;
		}
		
		
		// 4. 상품코드에 해당하는 상품의 모든 정보를 수정하는 메소드
		public int update(int goodsCode, String goodsName, int goodsPrice, String goodsMaker) throws SQLException {
			int rowNum;
			rowNum = stmt.executeUpdate(
					"update goodsinfo set goods_name = '" + goodsName +"', goods_made = '" + goodsMaker + "', goods_price = " + goodsPrice + "where goods_code = " + goodsCode);	
			
			return rowNum;
		}
		
		// 5. 상품명에 해당되는 상품코드를 반환하는 메소드
		public int select(String name) throws SQLException{
			int count = 0;
			ResultSet rs = stmt.executeQuery("select goods_code from goodsinfo where goods_name= '" + name + "'");
			
			while (rs.next()) {
				count++;
				int goodsCode = rs.getInt("goods_code");
				System.out.println(name + "의 상품코드: " + goodsCode);
			}
			return count;
		}
		
		// 6. 상품코드에 해당되는 상품정보를 반환하는 메소드(** GoodsInfo 타입으로 변환)
		public GoodsInfo select(int goodsCode) throws SQLException {
			ResultSet rs = stmt.executeQuery("select goods_name, goods_price, goods_made from goodsinfo where goods_code = " + goodsCode);
			GoodsInfo info = null;
			
			while (rs.next()) {
				String name = rs.getString("goods_name");
				int price = rs.getInt("goods_price");
				String maker = rs.getString("goods_made");
				info = new GoodsInfo(goodsCode, name, price, maker);
				
			}
			return info;
		}
		
		// 7. 상품코드와 상품명이 일치하는 상품을 삭제하는 메소드(delete)
		public int delete(int goodsCode, String goodsName) throws SQLException {
			
			int rowNum;
			rowNum = stmt.executeUpdate(
					"delete from goodsinfo where goods_name = '" + goodsName + "' and goods_code = " + goodsCode);	
			
			return rowNum;
		}
		
		// 8. 전체 상품정보(리스트)를 반환하는 메소드(** GoodsList 타입으로 반환)
		public GoodsList select() throws SQLException {
			GoodsList list = new GoodsList();
			
			ResultSet rs = stmt.executeQuery("select goods_code, goods_name, goods_price, goods_made from goodsinfo");
			GoodsInfo info = null;
			
			while (rs.next()) {
				int code = rs.getInt("goods_code");
				String name = rs.getString("goods_name");
				int price = rs.getInt("goods_price");
				String maker = rs.getString("goods_made");
				info = new GoodsInfo(code, name, price, maker);
				list.addGoods(info);
			}
			
			return list;
		}
		
		
		
		
		public void close() {
			try{
				stmt.close();
			}
			catch(Exception ignored){
			}
			try{
				conn.close();
			}
			catch(Exception ignored){
			}
		}
}
