package sec03.exam02;

import java.util.Calendar;

import sec03.exam01.Week;

public class EnumWeekExample {
	public static void main(String[] args) {
		// 열거 타입 변수 선언
		Week today = null;
		
		// Calendar.getInstance() 메솧드로 Calendar 객체를 얻음
		Calendar cal = Calendar.getInstance();
		// 일(1) ~ 토(7)까지의 숫자를 리턴
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		// 열거 타입 변수에 열거 상수 대입
		switch(week) {
		case 1 :
			today = Week.SUNDAY; break;
		case 2 :
			today = Week.MONDAY; break;
		case 3 :
			today = Week.TUESDAY; break;
		case 4 :
			today = Week.WEDNESDAY; break;
		case 5 :
			today = Week.THURSDAY; break;
		case 6 :
			today = Week.FRIDAY; break;
		case 7 :
			today = Week.SATURDAY; break;
		}
		
		System.out.println("오늘 요일 : " + today);
		// 오늘 요일 : TUESDAY
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합시다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}
		// 열심히 자바 공부합니다.
	}

}
