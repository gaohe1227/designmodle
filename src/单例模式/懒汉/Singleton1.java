package 单例模式.懒汉;
/**
 * 
 * Title:Singleton1
 * Description:线程安全的懒汉模式
 * Company:chaoxing
 * @author:高鹤
 * @date:2017年7月5日
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
