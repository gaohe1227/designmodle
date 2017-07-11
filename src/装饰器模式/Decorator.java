package װ����ģʽ;

/**
 * 
 * Description:������װ�����ĸ��࣬��Ҫ����һ��������ӿ�һ�µĽӿ�
 * (��Ҫ��Ϊ��ʵ��װ�������ܵĸ��ã��������װ����A����װ������һ�������װ����B����Ϊװ������Ҳ��һ��Component)
 * ��������һ��Component���󣬸ö�����ʵ���Ǳ�װ�εĶ���������̳�����ӿ��࣬
 * ��ֻ��Ϊĳ�������ӵ�һ�Ĺ��ܣ���װ������������װ��������װ��������
 * 
 * @author:�ߺ�
 * @date:2017��7��11��
 */
public abstract class Decorator implements Component {
	/**
	 * �����������
	 */
    protected Component component;
    
     /**
      * ���췽���������������
      * @param component
      */
	
	public Decorator(Component component) {
		super();
		this.component = component;
	}



	public  void operation(){
		  //ת�������������󣬿�����ת��ǰ��ִ��һЩ���Ӷ���  
        component.operation(); 
	}

}
