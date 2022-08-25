package nested;

public class AnonymousInnerClass {
	
	public static void main(String[] args) {
	
		MessageSender obj = new MessageSender() { // 이름없는 클래스 정의 시작 
			// 오직 send메소드 오버라이딩이 목적 
			// 왜 사용? -> 한번만 사용하고 말 클래스의 경우 = 재사용성이 없는 경우 
			// ex) 이벤트 -> 클릭시 일어나는 이벤트 등 단발성인 경우   
			@Override
			void send(String message) {
				System.out.println("발신: 홍동우");
				System.out.println("수신: 홍다은");
				System.out.println("메시지: " + message);
				System.out.println();
			}
		}; // 클래스 끝
		
		obj.send("굿모닝");
	}

}
