package sec02.exam01;

public class ArrayCreateByValueListExample1 {
	public static void main(String[] args) {
		
		// 값 목록으로 배열 생성
		int[] scores = {83,90,87};
		
		System.out.println("scores[0] : " + scores[0]);	// scores[0] : 83
		System.out.println("scores[1] : " + scores[1]); // scores[1] : 90
		System.out.println("scores[2] : " + scores[2]); // scores[2] : 87
		
		// 총합 구하기
		int sum = 0;
		for(int i =0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum); // 총합 : 260
		
		// 평균 구하기
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg); // 평균 : 86.66666666666667
		

	}
}
