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
	/**
	 *  ��̬���������࣬�������κζ����Ķ����������贴�����ʵ���Ϳ��Է��ʾ�̬������
	 *  ֮���Ի���������Ľ��������Ϊ������ֻΪ�����ഴ����һ����̬�����ĸ�����
	 *  Ҳ����ֻ����һ���ڴ�ռ䣬��Ȼ�ж��ʵ��������Щʵ��������ڴ�
	 */
	private static final Singleton instance = new Singleton();
     /**
      *  ˽�л���������ʹ�ò������ⲿ���ù�������Ҳ�Ͳ������ⲿʹ��
      */
	private Singleton() {
	}

	public static Singleton getInstance() {
		return instance;
	}
}
 
