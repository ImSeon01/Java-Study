package sec02.exam10;
public class ContinueExample {
	public static void main(String[] args) {
		// 1에서 10 사이에 짝수만 출력하는 코드
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}