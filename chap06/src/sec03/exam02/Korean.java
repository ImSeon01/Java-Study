package sec03.exam02;
// 생성자에서 필드 초기화
public class Korean {
	// 필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	// 생성자
	// 기본 생성자
	public Korean() {}
	// 매개변수 있는 생성자
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	@Override
	public String toString() {
		return "Korean [nation=" + nation + ", name=" + name + ", ssn=" + ssn + "]";
	}

}
