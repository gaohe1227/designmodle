package 桥接模式;

public class Bus extends AbstractCar {
	@Override
	void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.print("公交车");
	}
}
