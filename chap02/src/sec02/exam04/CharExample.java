package sec02.exam04;

public class CharExample {
	public static void main(String[] args) {
		char c1 = 'A';		// 문자를 직접 저장
		char c2 = 65;		// 10진수를로 저장
		char c3 = '\u0041'; // 16진수 로 저장
		
		char c4 = '가';		// 문자로 직접 저장
		char c5 = 44032;	// 10진수로 저장
		char c6 = '\uac00';	// 16진수로 저장
		
		System.out.println(c1); // A
		System.out.println(c2); // A
		System.out.println(c3); // A
		System.out.println(c4); // 가
		System.out.println(c5); // 가
		System.out.println(c6); // 가
	}

}
