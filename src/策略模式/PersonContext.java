package ����ģʽ;

/**
 * 
 * Title:PersonContext Description:������,ʹ�ò���ģʽ��Ҫ�������Ļ��� 
 * Company:chaoxing
 * 
 * @author:�ߺ�
 * @date:2017��7��7��
 */
public class PersonContext {
	private TravelStrategy strategy;

	public PersonContext(TravelStrategy strategy) {
		this.strategy = strategy;
	}

	public void executeStrategy() {
		strategy.travelAlgorithm();
	}
}
