package nested;

import java.util.HashMap;

// 로컬 이너 클래스 
public class NestedClassEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class ContactInfo {
			String address, phoneNo;
			public ContactInfo(String address, String phoneNo) {
				this.address = address;
				this.phoneNo = phoneNo;
			}
		}
		
		HashMap<String, ContactInfo> hashtable = new HashMap<String, ContactInfo>();
		
		hashtable.put("홍동우", new ContactInfo("서울시 강남구", "010-111-111"));
		hashtable.put("이댕댕", new ContactInfo("서울시 강남구", "010-111-222"));
		hashtable.put("김댕댕", new ContactInfo("서울시 강남구", "010-111-333"));
		hashtable.put("전댕댕", new ContactInfo("서울시 강남구", "010-111-444"));
		
		ContactInfo obj = hashtable.get("홍동우");
		System.out.println("홍동우의 연락처");
		System.out.println("주소 " + obj.address);
		System.out.println("전화번호 " + obj.phoneNo);
		
		

	}

}
