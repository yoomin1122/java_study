package chap01;

public class Data {

	public static void main(String[] args) {
		
		// 변수의 선언
		int a;
		int b;
		
		// 변수의 대입
		a = 2;
		b = 3;
		a = b;
		
		// a는 b의 값으로 대입한다고 정의하였기에, a에 저장된 값은 3이다.
		System.out.println("a : "+a);
		
		
		// 변수의 선언과 대입은 아래의 형식과 같이 동시에 가능하다.
		int c = 3;
		
		System.out.println("c : "+c);

	}

}
