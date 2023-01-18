package sec04.exam04;

public class QStopExample {
	public static void main(String[] args) throws Exception{
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			// keyCode가 113일 경우에 while 반복을 중지함
			if(keyCode == 113) {
				break;
			}
		}
		System.out.println("종료");
		// keyCode: 113
		// 종료
	}

}
