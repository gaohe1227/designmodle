package 享元模式;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 
 * Description:享元工厂:负责创建和管理享元角色。要想达到共享的目的，这个角色的实现是关键
 * 
 * @author:高鹤
 * @date:2017年7月11日
 */
public class FlyweightFactory {
	private ConcurrentHashMap flyweights = new ConcurrentHashMap();

	public FlyweightFactory() {
	}

	public Flyweight getFlyweight(Object obj) {
		Flyweight flyweight = (Flyweight) flyweights.get(obj);
		if (flyweight == null) {
			flyweight = new ConcreteFlyweight();
			flyweights.put(obj, flyweight);
		}
		return flyweight;
	}

	public int getFlyweightSize() {
		return flyweights.size();
	}
}
