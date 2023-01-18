package sec02.exam08;

public class CompareOperatorExample2 {
	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); 		// true
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); 		// false
		System.out.println((float)v4 == v5);// true
		// 실수의 저장 방식인 부동 소수점 방식이 0.1을 정확히 표현할 수 없기 때문
		// 0.1f는 0.1의 근사값(0.10000000149011612)으로 표현
	}

}
