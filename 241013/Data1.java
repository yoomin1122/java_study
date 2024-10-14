package chap01;

public class Data1 {

	public static void main(String[] args) {
		
		
		// 정수형
		byte a = 127;
		short b = 32767;
		int c = 2147483647;
		long d = 9223372036854775807l;
		
		System.out.println("정수형은 byte, short, int, long이 있다.");
		System.out.println("위 텍스트 기준 오른쪽으로 갈수록 비트 수가 2배씩 증가한다.");
		System.out.println("정수형 byte는 값이 " + a + "까지 가능하며");
		System.out.println("정수형 short는 값이 " + b + "까지 가능하며");
		System.out.println("정수형 int는 값이 " + c + "까지 가능하며");
		System.out.println("정수형 long는 값이 " + d + "까지 가능하다.");
		System.out.println("long을 사용할 때는, 정수 뒤에 l or L를 붙여줘야 한다.");
		
		
		// 실수형
		float e = 3.14f;
		double f = 1.592f;

		System.out.println("실수형은 float, double이 있다.");
		System.out.println("위 텍스트 기준 오른쪽으로 갈수록 비트 수가 2배씩 증가한다.");
		System.out.println(e);
		System.out.println(f);
		System.out.println("float형을 사용할 때는, 실수 뒤에 f or F를 붙여줘야 한다.");

		
		//문자 및 문자열
		char g = 'A';
		String h = "ABCDEFG";
		
		System.out.println("char는 한 문자만 작성이 가능하며 문자를 감쌀때는 작은따옴표 ' '로 감싸준다.");
		System.out.println("String는 문자열로 작성되며 문자를 감쌀때는 큰따옴표 \"\"로 감싸준다.");
		System.out.println(g);
		System.out.println(h);
	}

}
