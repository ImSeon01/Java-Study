package sec03.exam02;
// 객체 생성 후 필드값 출력
public class KoreanExample {
	public static void main(String[] args) {
		// 객체 생성
		Korean k1 = new Korean("박자바", "011225-1234567");
		// k1 필드값 출력
		System.out.println("k1.name : " + k1.name); // k1.name : 박자바
		System.out.println("k1.ssn : " + k1.ssn); // k1.ssn : 011225-1234567
		
		// 객체 생성
		Korean k2 = new Korean("김자바", "930525-0654321");
		// k2 필드값 출력
		System.out.println("k2.name : " + k2.name); // k2.name : 김자바
		System.out.println("k2.ssn : " + k2.ssn); // k2.ssn : 930525-0654321	
	}
}
