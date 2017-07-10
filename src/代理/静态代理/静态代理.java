package 代理.静态代理;
/**
 * 
 * Title:静态代理
 * Description:静态代理案例
 * Company:chaoxing
 * @author:高鹤
 * @date:2017年7月5日
 */
public class 静态代理 {
	public static void main(String args[]) {
		RealSubject subject = new RealSubject();
		Proxy p = new Proxy(subject);
		p.request();
	}
}

interface Subject {
	void request();
}

class RealSubject implements Subject {
	public void request() {
		System.out.println("RealSubject");
	}
}

class Proxy implements Subject {
	private Subject subject;

	public Proxy(Subject subject) {
		this.subject = subject;
	}

	public void request() {
		System.out.println("begin");
		subject.request();// 调用真实对象的request();
		System.out.println("end");
	}
}