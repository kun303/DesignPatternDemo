package pattern.strategy;

public class CatQuack implements QuackBehavior {

	@Override
	public void quack() {

		System.out.println(" miao~ ");
	}

}
