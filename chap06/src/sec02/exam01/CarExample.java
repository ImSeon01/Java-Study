package sec02.exam01;

public class CarExample {
	public static void main(String[] args) {
		// 객체 생성
		Car myCar = new Car();
		
		// 필드값 읽기
		System.out.println("제작회사 : " + myCar.company); // 제작회사 : 현대자동차
		System.out.println("모델명 : " + myCar.model); // 모델명 : 그랜저
		System.out.println("색깔 : " + myCar.color); // 색깔 : 검정
		System.out.println("최고속도 : " + myCar.maxSpeed); // 최고속도 : 350
		System.out.println("현재속도 : " + myCar.speed); // 현재속도 : 0
		
		// 필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도 : " + myCar.speed); // 수정된 속도 : 60
	}

}
