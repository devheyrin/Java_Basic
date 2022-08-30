package jdbc.goods;

// 상품 객체 클래스(객체 생생이 목적인 클래스) = bean, VO
public class GoodsInfo {
	
	private int goodsCode;
	private String goodsName;
	private int goodsPrice;
	private String goodsMaker;
	
	public GoodsInfo() {
		this(0,"이름없음",0,"제조사없음");
	}
	public GoodsInfo(int goodsCode, String goodsName, int goodsPrice, String goodsMaker){
		this.goodsCode=goodsCode;
		this.goodsName=goodsName;
		this.goodsPrice=goodsPrice;
		this.goodsMaker=goodsMaker;
	}
	
	public int getGoodsCode() {
		return goodsCode;
	}
	public void setGoodsCode(int goodsCode) {
		this.goodsCode = goodsCode;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public String getGoodsMaker() {
		return goodsMaker;
	}
	public void setGoodsMaker(String goodsMaker) {
		this.goodsMaker = goodsMaker;
	}
	
	public String toString() {
		String str = "코드 : "+goodsCode+" 이름 : "+goodsName+" 가격 : "+goodsPrice+" 제조사 : "+goodsMaker;
		return str;
	}

}
