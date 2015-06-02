package pattern.strategy;

public abstract class Felidae {

	public RunBehavior mRunBehavior;
	public QuackBehavior mQuackBehavior;
	
	public Felidae(){}
	
	public abstract void display();
	
	public void performRun(){
		mRunBehavior.run();
	}
	
	public void performQuack(){
		mQuackBehavior.quack();
	}

	public void setRunBehavior(RunBehavior run) {
		this.mRunBehavior = run;
	}

	public void setQuackBehavior(QuackBehavior quack) {
		this.mQuackBehavior = quack;
	}
	
	
}
