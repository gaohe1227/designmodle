package 设计模式.动态代理;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Test {

	public static void main(String[] args)
			throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		/*
		 * Moveable m= (Moveable) Myproxy1.newProxyIntstance(Moveable.class);
		 * m.move();
		 */
		Car car = new Car();
		MyImvocationHandle myImvocationHandle = new TimerImvocationHandle(car);
		Moveable m = (Moveable) Myproxy2.newProxyIntstance(Moveable.class, myImvocationHandle);
		m.move();
	}

}
