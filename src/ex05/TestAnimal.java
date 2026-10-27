package ex05;

class Dog {
	String  name;
	void    eat() {
		System.out.println(name + "(이)가 먹는다");
	}
	void    bark() {
		System.out.println(name + "(이)가 멍멍");
	}
}

class Cat {
	String  name;
	void    eat() {
		System.out.println(name + "(이)가 먹는다");
	}
	void    meow() {
		System.out.println(name + "(이)가 야옹");
	}
}


public class TestAnimal {

	public static void main(String[] args) {
		Dog  chu = new Dog();
		chu.name = "츄";
		chu.eat();
		chu.bark();
		
		Cat  nero = new Cat();
		nero.name = "네로";
		nero.eat();
		nero.meow();

	}

}







