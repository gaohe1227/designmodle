package 桥接模式;

public class Car extends AbstractCar {
	@Override
	void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.print("小汽车");
	}
}
