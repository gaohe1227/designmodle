package ����ģʽ.����;
/**
 * 
 * Title:Singleton1
 * Description:�̰߳�ȫ������ģʽ
 * Company:chaoxing
 * @author:�ߺ�
 * @date:2017��7��5��
 */
public class Singleton1 {
	private static Singleton1 instance;

	private Singleton1() {
	}

	public static synchronized Singleton1 getInstance() {
		if (instance == null) {
			synchronized (instance) {
				if (instance == null){
					instance = new Singleton1();
				}
			}
			
		}
		return instance;
	}
}
