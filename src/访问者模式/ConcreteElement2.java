package ������ģʽ;

public class ConcreteElement2 extends Element {

	@Override
	protected void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
		
	}

	@Override
	protected void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("����Ԫ��ConcreteElement2");
	}

}
