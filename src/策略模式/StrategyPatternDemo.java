package ����ģʽ;

public class StrategyPatternDemo {
	public static void main(String[] args) {
		PersonContext context = new PersonContext(new TrainStrategy());
		context.executeStrategy();
		context = new PersonContext(new BicycleStrategy());
		context.executeStrategy();

	}
}
