package sec02.exam02;
// 필드값 출력
public class FiledInitValueExample {
	public static void main(String[] args) {
		// 객체 생성
		FieldInitValue fiv = new FieldInitValue();
		
		// 기본 타입
		// 정수 타입
		System.out.println("byteFiled : " + fiv.byteField); // byteFiled : 0
		System.out.println("shortField : " + fiv.shortField); // shortField : 0
		System.out.println("intField : " + fiv.intField); // intField : 0
		System.out.println("longField : " + fiv.longfield); // longField : 0\
		// boolean 타입
		System.out.println("booleanField : " + fiv.booleanField); // booleanField : false
		// 문자형 타입
		System.out.println("charField : " + fiv.charField); // charField : 
		// 실수 타입
		System.out.println("floatField : " + fiv.floatField); // floatField : 0.0
		System.out.println("doubleField : " + fiv.doubleField); // doubleField : 0.0
		
		// 참조 타입
		System.out.println("arrField : " + fiv.arrField); // arrField : null
		System.out.println("referenceField : " + fiv.referenceField); // referenceField : null
	}

}
