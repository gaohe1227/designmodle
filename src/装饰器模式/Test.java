package װ����ģʽ;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component component=new ConcreteComponent();//������Ҫ��װ�ε�ԭʼ����
		Decorator decorator=new ConcreteDecoratorA(component);//������component���ӹ���
		decorator.operation();

	}

}
