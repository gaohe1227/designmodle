package ������ģʽ;
/**
 * 
 * Description:Ԫ����:ʵ�ֳ���Ԫ������������accept������ͨ������visitor.visit(this)���������Ѿ��γ�һ�ֶ�ʽ�ˡ�
 * @author:�ߺ�
 * @date:2017��7��12��
 */
public class ConcreteElement1 extends Element {

	@Override
	protected void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
		
	}

	@Override
	protected void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("����Ԫ��ConcreteElement1");
	}

}
