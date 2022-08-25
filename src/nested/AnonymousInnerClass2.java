package nested;

public class AnonymousInnerClass2 {
	public static void main(String[] args) {
		
		Player obj = new Player() { // 인터페이스를 new 하는것이 아니라, 이름없는 클래스를 정의하는 것 
			
			@Override
			public void stop() {
				// TODO Auto-generated method stub
				System.out.println("플레이 종료");
				
			}
			
			@Override
			public void play(String source) {
				// TODO Auto-generated method stub
				System.out.println("플레이 시작: " + source);
			}
		}; 
		
		// 인터페이스를 구현하는 클래스를 따로 만들지 않고, 이름없는 클래스를 만들어 구현해 사용할 수 있다. 
		// 새 클래스를 만들고 오버라이딩 vs 이름없는 클래스에서 오버라이딩 의 차이 
		// 재사용필요없는 이벤트 등의 경우 이름없는 클래스 사용 
		
		obj.play("음악.mp3");
		obj.stop();
		
	}
	
}