package sec02.exam03;

public class ArrayCreateByNewExample {
	public static void main(String[] args) {
		// int 타입 배열 변수 arr1 선언 & new 연산자로 길이가 3인 배열 생성
		int[] arr1 = new int[3];
		for(int i=0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
			// arr1[0] : 0
			// arr1[1] : 0
			// arr1[2] : 0
			}
			// 배열 arr1의 0, 1, 2 인덱스에 각각 10, 20, 30를 저장 
			arr1[0] = 10;
			arr1[1] = 20;
			arr1[2] = 30;
			for(int i = 0; i < arr1.length; i++) {
				System.out.println("arr1[" + i + "] : " + arr1[i]);
				// arr1[0] : 10
				// arr1[1] : 20
				// arr1[2] : 30
			}
			// double 타입 배열 변수 arr2 선언 & new 연산자로 길이가 3인 배열 생성
			double[] arr2 = new double[3];
			for(int i = 0; i < arr2.length; i++) {
				System.out.println("arr2[" + "] : " + arr2[i]);
				// arr2[] : 0.0
				// arr2[] : 0.0
				// arr2[] : 0.0
			}
			// 배열 arr2의 0, 1, 2 인덱스에 각각 0.1, 0.2, 0.3을 저장
			arr2[0] = 0.1;
			arr2[1] = 0.2;
			arr2[2] = 0.3;
			for(int i=0; i < arr2.length; i++) {
				System.out.println("arr2[" + i + "] : " + arr2[i]);
				// arr2[0] : 0.1
				// arr2[1] : 0.2
				// arr2[2] : 0.3
			}
			// String 타입 배열 변수 arr3 선언 & new 연산자로 길이가 3인 String 배열 생성
			String[] arr3 = new String[3];
			for(int i = 0; i < arr3.length; i++) {
				System.out.println("arr3[" + i +  "] : " + arr3[i]);
				// arr3[0] : null
				// arr3[1] : null
				// arr3[2] : null
			}
			arr3[0] = "1월";
			arr3[1] = "2월";
			arr3[2] = "3월";
			for(int i = 0; i < arr3.length; i++) {
				System.out.println("arr3[" + i + "] : " + arr3[i]);
				// arr3[0] : 1월
				// arr3[1] : 2월
				// arr3[2] : 3월
			}
		
			

	}

}
