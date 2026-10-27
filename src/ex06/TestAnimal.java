package ex06;

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
		System.out.println(name + "(이)가 어흥");
	}
}

public class TestAnimal {

	public static void main(String[] args) {
		Dog chu = new Dog();
		chu.name = "츄";
		chu.eat();
		chu.bark();
		
		Cat nero = new Cat();
		nero.name = "네로";
		nero.eat();
		nero.meow();
		
		Tiger neo = new Tiger();
		neo.name = "네오";
		neo.eat();
		neo.cry(); 
	}
}
