package sec03.exam01;

public class CarExample {
	public static void main(String[] args) {
		// 객체 생성
		// Car myCar = new Car(); 개본 생성자를 호출할 수 없음
		Car myCar = new Car("검정", 3000);
		System.out.println(myCar); // Car [color=검정, cc=3000]
	}
}
