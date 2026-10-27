package ex07;

class Animal {
	String name; 
	
	void   eat() {
		System.out.println(name + "(이)가 먹는다.");
	}
}

class Dog extends Animal {
	void   bark() {
		System.out.println(name + "(이)가 멍멍");
	}
}

class Cat extends Animal {
	void   meow() {
		System.out.println(name + "(이)가 야옹");
	}
}

class Tiger extends Animal {
	void   cry() {
		System.out.println(name + "(이)가 어흥 ~~~~~");
	}
}

public class TestAnimalInherit {
	
	public static void main(String[] args) {
		Dog   chu   =  new Dog();
		work(chu, "츄");
				
		Cat   nero  =  new Cat();
		work(nero, "네로");
				
		Tiger neo   =  new Tiger();
		work(neo, "네오");
    
	}


	// 2. 동일한 부모클래스를 상속한 클래스일 경우 하나의 함수로 구현가능
		
	private static void work(Animal animal, String name) {
			
		animal.name    =  name;
		animal.eat();	
	
		// class 강제 형변환
		// animal 이 Dpg타입에서 호출된 것인가
		if(animal instanceof Dog)
			((Dog) animal).bark();
	
		if(animal instanceof Cat)
			((Cat) animal).meow();
	
		if(animal instanceof Cat)
			((Tiger) animal).cry();
	
		}
	
	
		/* 1. method overloading 으로 처리
		private static void work(Tiger neo, String string) {
			neo.name   =  "네오";
			neo.eat();
			neo.cry();		
		}

		private static void work(Cat nero, String string) {
			nero.name   =  "네로";
			nero.eat();
			nero.meow();	
		}

		private static void work(Dog chu, String string) {
			chu.name    =  "츄";
			chu.eat();
			chu.bark();		
		}
		*/

	}
