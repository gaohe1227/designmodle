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
	/**
	 *  静态变量属于类，不属于任何独立的对象，所以无需创建类的实例就可以访问静态变量。
	 *  之所以会产生这样的结果，是因为编译器只为整个类创建了一个静态变量的副本，
	 *  也就是只分配一个内存空间，虽然有多个实例，但这些实例共享该内存
	 */
	private static final Singleton instance = new Singleton();
     /**
      *  私有化构造器，使得不能在外部调用构造器，也就不能在外部使用
      */
	private Singleton() {
	}

	public static Singleton getInstance() {
		return instance;
	}
}
 
