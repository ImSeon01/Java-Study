package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열 : \"" + inputData + "\"");
			if(inputData.equals("q")) {
				break;
			}
		}
		System.out.println("종료");
		/*
			1
			입력된 문자열 : "1"
			2
			입력된 문자열 : "2"
			3
			입력된 문자열 : "3"
			4
			입력된 문자열 : "4"
			5
			입력된 문자열 : "5"
			q
			입력된 문자열 : "q"
			종료
		*/
	}

}
