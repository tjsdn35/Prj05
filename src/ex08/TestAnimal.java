package ex08;
// abstract (추상) class 를 이용한 다형성구현 방법2
abstract class Animal {
	String name;
	void   eat(String food) {
		System.out.println(name + "(이)가 " + food + "을 먹는다");
	}
	abstract void sound(); // abstract : 코딩이 없는 함수를 만든다
						   // 추상 메소드
}

class Dog extends Animal {
	/*
	 String name;
	void   eat(String food) {
		System.out.println(name + "(이)가 " + food + "을 먹는다");
	} 
	 */

	@Override  // 재정의 abstract 메소드를 자식이 다시 작성한다
	void sound() {
		System.out.println(name + "(이)가 멍멍");
		
	}
	
}

class Cat extends Animal {

	@Override
	void sound() {
		System.out.println(name + "(이)가 야옹");
		
	}
	
}

class Tiger extends Animal {

	@Override
	void sound() {
		System.out.println(name + "(이)가 어흥 ~~~~~");
		
	}
	
}

public class TestAnimal {

	public static void main(String[] args) {
		// Animal ani = new Animal(); // abstract class 는 new 불가능
		Dog chu = new Dog();
		work(chu, "츄", "개껌");
		
		Cat nero= new Cat();
		work(nero, "네로", "츄르");
		
		Tiger neo= new Tiger();
		work(neo, "네오", "닭한마리");

	}

	private static void work(Animal animal, String name, String food) {
		animal.name = name;
		animal.eat(food);
		animal.sound();
		
	}

}







