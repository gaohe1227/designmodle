package ����ģʽ.����;
/**
 * 
 * Title:Singleton
 * Description:���һ�ε��þͼ���,�������߳�ͬ��������,��
 * Company:chaoxing
 * @author:�ߺ�
 * @date:2017��7��5��
 */
public class Singleton {
	private static Singleton instance = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return instance;
	}
}
 
