package pattern.strategy;

public class Tiger extends Felidae {

	public Tiger() {
		super.mQuackBehavior = new TigerQuack();
		super.mRunBehavior = new TigerRun();
	}

	@Override
	public void display() {
		System.out.println(" im tiger ");
	}

}
