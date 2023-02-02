package sec03.exam03;
// 객체 생성 시 생성자 선택
public class CarExample {
	public static void main(String[] args) {
		// 생성자1 선택
		Car car1 = new Car();
		System.out.println("car1.company : " + car1.company); // car1.company : 현대자동차
		System.out.println();
		
		// 생성자2 선택
		Car car2  = new Car("자가용");
		System.out.println("car2.company : " + car2.company); // car2.company : 현대자동차
		System.out.println("car2.model : " + car2.model); // car2.model : 자가용
		System.out.println();
		
		// 생성자3 선택
		Car car3 = new Car("자가용", "빨강");
		System.out.println("car3.company : " + car3.company); // car3.company : 현대자동차
		System.out.println("car3.model : " + car3.model); // car3.model : 자가용
		System.out.println("car3.color : " + car3.color); // car3.color : 빨강
		System.out.println();
		
		// 생성자4 선택
		Car car4 = new Car("택시", "검정", 200);
		System.out.println("car4.company : " + car4.company); // car4.company : 현대자동차
		System.out.println("car4.model : " + car4.model); // car4.model : 택시
		System.out.println("car4.color : " + car4.color); // car4.color : 검정
		System.out.println("car4.maxSpeed ; " + car4.maxSpeed); // car4.maxSpeed ; 200
	}
}
