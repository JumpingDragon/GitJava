package testProject_240503;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("We were both young when I first saw you");
		
		
		int num;  // 정수 변수 선언
		num = 10;  // 초기값 설정
		
		double numD; // 실수 변수 선언
		numD = 3.14; //초기값 설정
		
		String str;  // 문자열 변수 선언
		str = "Korea"; // 초기값 설정
		
		boolean logi; //논리형 변수 선언 (true, false 만 저장 가능)
		logi = true; // 초기값 설정
		
		char ch; // 문자 변수 선언 (1글자만 저장)->''로 저장해야 함
		ch = 'A';
		
		char ch2 = 65;  // 정수를 char 변수에 저장하면 해당 정수가 가리키는 아스키코드 문자가 저장됨.
		System.out.println(ch2);
		
		// 파이썬 : (int)numD -> 정수로 형변환
		int numDint = (int)numD;
		System.out.println(numDint);
		
		double idou = (double)num;
		System.out.println(idou);
		
		String strInt = "1000";
		// 파이썬 : (int)strInt -> 문자열 숫자 -> 정수로 형변환
		// int strSample = (int)strInt; // java에서는 임시적 형변환으로 문자열을 숫자(정수, 실수)로 변환 불가함
		
		// 그래서 Wrapper 클래스를 사용하여 문자열 -> 정수(실수) 형변환
		int strSamp = Integer.parseInt(strInt);
		System.out.println(strSamp);
		
		String strD = "3.14";
		double strSamp2 = Double.parseDouble(strD);  // 문자열 "3.14" -> 실수 3.14로 변환
		System.out.println(strSamp2);
		
		// 정수(실수)를 문자열로 변환
		// 파이썬 : (str) 1000 -> 문자열로 취급
		
		int num1 = 157;
		
		String numstr1 = String.valueOf(num1); // 문자열 -> 정수로 변환
		System.out.println(numstr1);
	}

}
