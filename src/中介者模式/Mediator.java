package �н���ģʽ;

/**
 * 
 * Description:�н�ʵ����
 * 
 * ע�������ͨ����������Ķ�����н���,�����˵����ط���
 * @author:�ߺ�
 * @date:2017��7��10��
 */
public class Mediator extends AbstractMediator {

	public Mediator(AbstractColleague a, AbstractColleague b) {
		super(a, b);
	}

	// ����A��B��Ӱ��
	public void AaffectB() {
		int number = A.getNumber();
		B.setNumber(number * 100);
	}

	// ����B��A��Ӱ��
	public void BaffectA() {
		int number = B.getNumber();
		A.setNumber(number / 100);
	}
	 public static void main(String[] args){  
	        AbstractColleague collA = new ColleagueA();  
	        AbstractColleague collB = new ColleagueB();  
	          
	        AbstractMediator am = new Mediator(collA, collB);  
	          
	        System.out.println("==========ͨ������AӰ��B==========");  
	        collA.setNumber(1000, am);  
	        System.out.println("collA��numberֵΪ��"+collA.getNumber());  
	        System.out.println("collB��numberֵΪA��10����"+collB.getNumber());  
	  
	        System.out.println("==========ͨ������BӰ��A==========");  
	        collB.setNumber(1000, am);  
	        System.out.println("collB��numberֵΪ��"+collB.getNumber());  
	        System.out.println("collA��numberֵΪB��0.1����"+collA.getNumber());  
	          
	    }  
}
