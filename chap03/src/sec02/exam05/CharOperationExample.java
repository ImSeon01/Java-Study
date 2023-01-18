package sec02.exam05;

public class CharOperationExample {
	public static void main(String[] args) {
		
		char c1 = 'A' + 1; // char c1 = 66;으로 컴파일 됨
		char c2 = 'A';
		// char c3 = c2 + 1;
		// char 변수가 산술 연산에 사용되면 int 타입으로 변환되므로 연산 결과는 int 타입이 됨
		char c3 = (char)(c2 + 1);
		
		System.out.println("c1 : " + c1);	// c1 : B
		System.out.println("c2 : " + c2);	// c2 : A
		System.out.println("c3 : " + c3); 	// c2 : A
		// 리터럴 간의 연산은 컴파인 단계에서 수행하기 때문에 타입 변환이 없음 => 5라인은 아무 문제가 없음;
		// 변수와 1을 더하면 변수는 int 타입으로 변환되고 1과 연산이 되기 때문에 연산 결과는 int 타입이 됨 
		// => char 타입인 c3에 저장하므로 컴파일 에러가 발생
		
	}

}
