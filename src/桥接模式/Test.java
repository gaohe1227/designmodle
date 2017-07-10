package ге╫сдёй╫;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractRoad speedWay = new SpeedWay();
		speedWay.aCar = new Car();
		speedWay.run();

		AbstractRoad street = new Street();
		street.aCar = new Bus();
		street.run();
	}

}
