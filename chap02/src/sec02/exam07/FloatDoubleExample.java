package sec02.exam07;

public class FloatDoubleExample {
	public static void main(String[] args) {
		// 실수값을 저장
		// float var1 = 3.14; Type mismatch: cannot convert from double to float
		float var2 = 3.14f;
		double var3 = 3.14;
		
		// 정밀도 테스트
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		
		System.out.println("var2 : " + var2); // var2 : 3.14
		System.out.println("var3 : " + var3); // var3 : 3.14
		System.out.println("var4 : " + var4); // var4 : 0.12345679
		System.out.println("var5 : " + var5); // var5 : 0.12345678901234568
		// double 타입인 var5가 float 타입인 var보다 2배 이상 정밀한 값으로 출력
		
		// e 사용하기
		double var6 = 3e6;
		float var7 = 3e6f;
		double var8 = 2e-3;
		System.out.println("var6 : " + var6); // var6 : 3000000.0
		System.out.println("var7 : " + var7); // var7 : 3000000.0
		System.out.println("var8 : " + var8); // var8 : 0.002
	}

}
