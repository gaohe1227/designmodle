package ����.��̬����;
/**
 * 
 * Title:��̬����
 * Description:��̬������
 * Company:chaoxing
 * @author:�ߺ�
 * @date:2017��7��5��
 */
public class ��̬���� {
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
		subject.request();// ������ʵ�����request();
		System.out.println("end");
	}
}