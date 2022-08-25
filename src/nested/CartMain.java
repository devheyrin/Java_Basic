package nested;

public class CartMain {
	public static void main(String[] args) {
		Cart cart = new Cart();
		cart.addItem("초콜렛", 3, 2000);
		cart.addItem("소시지", 300, 1000);
		cart.addItem("삼각김밥", 10, 1500);
		printCart(cart);

	}
	
	static void printCart(Cart cart) {
		int num = cart.getItemNum();
		System.out.println("상품명\t 수량\t 단가 \t 금액");
		System.out.println("----------------------");
		for (int cnt = 0; cnt < num; cnt++) {
			Cart.Item item = cart.getItem(cnt);
			System.out.printf("%3d %5s %5d %7d %7d %n", cnt+1, item.name, item.num, item.unitPrice, item.getPrice());
		}
		System.out.println("----------------------");
		System.out.printf("      총계              %10d %n", cart.getTotalPrice());
	}
}
