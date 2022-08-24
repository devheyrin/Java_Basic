package animal;

public class Cat extends Animal implements Pet {
	private String name;
	
	public Cat(String name) {
		super(4);
		this.name = name;
	}
	
	public Cat() {
		super(4);
		this.name = "도둑고양이";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름 : " + this.name;
	}
	
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
		
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("하루종일 혼자 헤엄치며 놉니다.");	
	}
	
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("다리갯수"+super.legs);
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("");
	}
	

}
