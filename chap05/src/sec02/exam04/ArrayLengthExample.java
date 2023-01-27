package sec02.exam04;

public class ArrayLengthExample {
	public static void main(String[] args) {
		// int 배영 변수 scores 선언 & 값 목록으로 배열 생성
		int[] scores = {83,90,87};
		// 총합 구하기
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum); // 총합 : 260
		
		// 평균 구하기
		double avg = (double)sum / scores.length;
		System.out.println("평균 : " + avg); // 평균 : 86.66666666666667
	}
}
