package ����¼ģʽ;

/**
 * 
 * Description:����¼:����洢Originator������ڲ�״̬�������Է�ֹOriginator���������������ʱ���¼��
 *             ����¼�������ӿڣ�Caretakerֻ�ܿ�������¼��խ�ӿڣ���ֻ�ܽ�����¼���ݸ���������
 *             Originatorȴ�ɿ�������¼�Ŀ�ӿڣ����������ʷ��ص���ǰ״̬����Ҫ����������
 * 
 * @author:�ߺ�
 * @date:2017��7��12��
 */
public class Memento {
	private String state = "";

	public Memento(String state) {
		super();
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
