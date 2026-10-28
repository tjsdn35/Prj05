package ex11;
// interface 특징 : 규칙을 부여, 통일성

interface Ipo {
	void input();
	void process();
	void output();
}

class Job implements Ipo {

	@Override
	public void input() {
		System.out.println("input");
	}

	@Override
	public void process() {
		System.out.println("process");
	}

	@Override
	public void output() {
		System.out.println("output");
	}
	
}

public class TestInterface {

	public static void main(String[] args) {
		Job job1 = new Job();
		job1.output();
		job1.process();
		job1.output();

	}

}






