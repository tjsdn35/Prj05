package ex10;

interface IDuck {
	void swim();
}
interface IRacoon {
	void dig();
}

class DuckRacoon implements IDuck, IRacoon {
	
	@Override
	public void swim() {
		System.out.println("헤엄을 칩니다");
	}
	
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



