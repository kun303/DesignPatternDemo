package pattern.strategy;

public class Cat extends Felidae {

	public Cat() {
		super.mQuackBehavior = new CatQuack();
		super.mRunBehavior = new CatRun();
	}
	@Override
	public void display() {
		System.out.println("im cat");
	}

}
