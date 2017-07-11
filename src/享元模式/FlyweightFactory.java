package ��Ԫģʽ;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 
 * Description:��Ԫ����:���𴴽��͹�����Ԫ��ɫ��Ҫ��ﵽ�����Ŀ�ģ������ɫ��ʵ���ǹؼ�
 * 
 * @author:�ߺ�
 * @date:2017��7��11��
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
