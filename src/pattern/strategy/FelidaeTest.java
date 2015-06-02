package pattern.strategy;

public class FelidaeTest {

	public static void main(String[] args) {
		
		Felidae felidae1 = new Cat();
		Felidae felidae2 = new Tiger();
		
		felidae1.performQuack();
		felidae2.performQuack();

		felidae1.performRun();
		felidae2.performRun();
	}

}
