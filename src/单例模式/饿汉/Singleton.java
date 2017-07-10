package 单例模式.饿汉;
/**
 * 
 * Title:Singleton
 * Description:类第一次调用就加载,避免了线程同步的问题,但
 * Company:chaoxing
 * @author:高鹤
 * @date:2017年7月5日
 */
public class Singleton {
	private static Singleton instance = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return instance;
	}
}
 
