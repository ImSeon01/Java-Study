package sec02.exam03;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		// long var3 = 1000000000000; 컴파일 에러 The literal 1000000000000 of type int is out of range 
		long var4 = 1000000000000L;
		
		System.out.println(var1); // 10
		System.out.println(var2); // 20
		System.out.println(var4); // 1000000000000
	}
}