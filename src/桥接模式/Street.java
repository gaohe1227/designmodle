package 桥接模式;

public class Street extends AbstractRoad {
	@Override
	void run() {
		// TODO Auto-generated method stub
		super.run();
		aCar.run();
		System.out.println("在市区街道行驶");
	}
}
