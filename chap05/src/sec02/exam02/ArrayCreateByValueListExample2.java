package sec02.exam02;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		// int형 배열 변수 scores 선언
		int[] scores;
		// new 연산자로 배열 생성
		// scores = {83,90,87}; 컴파일 오류
		scores = new int[] {83,90,87};
		
		// 총합 구하기
		int sum1 = 0;
		for(int i=0; i < scores.length; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1); // 총합 : 260
		
		// 메소드를 호출하여 총합 구하기 
		// int sum2 = add({83,90, 87}); 컴파일 오류
		int sum2 = add(new int[] {83,90, 87});
		System.out.println("총합 : " + sum2); // 총합 : 260
		System.out.println();
		
	}
	// 총합을 계산해서 리턴하는 add 메소드
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
