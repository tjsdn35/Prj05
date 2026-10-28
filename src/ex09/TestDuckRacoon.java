package ex09;

// class 는 다중상속불가능
// interface를 이용하여 다중상속을 구현한다

// class 다중상속 : c++ 만 가능, java 랑 c# 은 안됨
// 오리너구리 class = 오리 class + 너구리 class
class Duck {
	void swim() {
		System.out.println("헤엄을 칩니다");
	}
}

// interface
// 모든함수가 abstract 일때 해당클래스 interface 롤 표현가능하다
/*
abstract class Sachic {
	abstract int add(int v1, int v2);
	abstract int sub(int v1, int v2);
	abstract int mul(int v1, int v2);
	abstract int div(int v1, int v2);
} // == 

interface Sachic {
	 int add(int v1, int v2);
	 int sub(int v1, int v2);
	 int mul(int v1, int v2);
	 int div(int v1, int v2);
}
*/
interface Racoon {
	void dig (); 
}
// java extends 뒤에는 한개의 class 만 사용가능 - 한개만 상속가능
class DuckRacoon extends Duck implements Racoon {

	@Override
	public void dig() {
		System.out.println("땅을 팝니다");
		
	}
	
}

public class TestDuckRacoon {

	public static void main(String[] args) {
		DuckRacoon dr = new DuckRacoon();
		dr.swim();
		dr.dig();

	}

}
