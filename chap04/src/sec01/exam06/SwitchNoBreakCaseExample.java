package sec01.exam06;

public class SwitchNoBreakCaseExample {
	public static void main(String[] args) {
		int time = (int) (Math.random()*4) + 8; 		// 8<= .. <=11사이의 정수 뽑기
		System.out.println("[현재 시각 " + time + " 시]");
		
		switch(time) {
		case 8 :
			System.out.println("출근입니다.");
		case 9 :
			System.out.println("회의를 합니다.");
		case 10 :
			System.out.println("업무를 봅니다.");
		default :
			System.out.println("외근을 나갑니다.");
		}
		// break가 붙어 있는 이유는 다음 case를 실행하지 않고 switch문을 빠져나가기 위해서
		// break가 없다면 case 값과는 상관없이  다음 case가 연달아 실행
	}
}
