package װ����ģʽ;
/**
 * 
 * Description:װ�����ľ���ʵ�ֶ���������������ְ��
 * operationFirst()��operationLast()Ϊǰ����Ҫ��ӵĹ���
 * @author:�ߺ�
 * @date:2017��7��11��
 */
public class ConcreteDecoratorA extends Decorator{

	public ConcreteDecoratorA(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	  private void operationFirst(){System.out.println("ִ��ǰ�ķ���"); } //�ڵ��ø����operation����֮ǰ��Ҫִ�еĲ���  
      private void operationLast(){System.out.println("ִ�к�ķ���"); } //�ڵ��ø����operation����֮����Ҫִ�еĲ���  
      public void operation() {  
          //���ø���ķ����������ڵ���ǰ��ִ��һЩ���Ӷ���  
          operationFirst(); //��ӵĹ���  
          super.operation();  //�������ѡ���Եĵ��ø���ķ�����������������൱����ȫ��д�˷�����ʵ�����µĹ���  
          operationLast(); //��ӵĹ���  
  }  
}
