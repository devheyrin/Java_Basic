package jdbc.goods;
import java.util.*;

// 여러 상품들을 처리하기 위한 컬렌셕 객체
public class GoodsList{

	private ArrayList<GoodsInfo> list;

	public GoodsList(ArrayList<GoodsInfo> list){
		this.list = list;
	}

	public GoodsList(){
		this(new ArrayList<GoodsInfo>());
	}

	// list에 goods 추가 메소드
	public void addGoods(GoodsInfo info){
		list.add(info);
	}

	// list 객체를 출력하는 메소드
	public void printList(){
		for(GoodsInfo gi: list)
			System.out.println(gi);
	}

	public ArrayList<GoodsInfo> getGoods(){
		return list;
	}

	public Iterator<GoodsInfo> search(){
		return list.iterator();
	}

	
}
