package pattern.strategy;

public class CatRun implements RunBehavior {

	@Override
	public void run() {
		System.out.println("im cat,i can run");
	}

}
