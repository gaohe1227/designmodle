package ������ģʽ;
/**
 * 
 * Description:ʵ�ʷ����ߣ�ʵ�ֳ���������������ķ�������Ӱ�쵽�����߷��ʵ�һ�����ø�ʲô��Ҫ��ʲô���顣
 * @author:�ߺ�
 * @date:2017��7��12��
 */
public class VisitorImpl implements Visitor {

	@Override
	public void visit(ConcreteElement1 concreteElement1) {
		// TODO Auto-generated method stub
		concreteElement1.doSomething();
	}

	@Override
	public void visit(ConcreteElement2 concreteElement2) {
		// TODO Auto-generated method stub
		concreteElement2.doSomething();
	}

}
