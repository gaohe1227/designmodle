package ������ģʽ;

/**
 * 
 * Description:����Ԫ����: �ӿڻ��߳����࣬����������һ������߷��ʣ���������ͨ��accept�����еĲ���������ġ�
 *              ����Ԫ��һ�������෽����һ�����Ǳ����ҵ���߼��������������������������������
 * 
 * @author:�ߺ�
 * @date:2017��7��12��
 */
public abstract class Element {
	protected abstract void accept(Visitor visitor);
	protected abstract void doSomething();

}
