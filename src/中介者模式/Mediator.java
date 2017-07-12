package 中介者模式;

/**
 * 
 * Description:中介实现类
 * 
 * 注：对像间通过第三方类的对象进行交互,体现了迪米特法则
 * @author:高鹤
 * @date:2017年7月10日
 */
public class Mediator extends AbstractMediator {

	public Mediator(AbstractColleague a, AbstractColleague b) {
		super(a, b);
	}

	// 处理A对B的影响
	public void AaffectB() {
		int number = A.getNumber();
		B.setNumber(number * 100);
	}

	// 处理B对A的影响
	public void BaffectA() {
		int number = B.getNumber();
		A.setNumber(number / 100);
	}
	 public static void main(String[] args){  
	        AbstractColleague collA = new ColleagueA();  
	        AbstractColleague collB = new ColleagueB();  
	          
	        AbstractMediator am = new Mediator(collA, collB);  
	          
	        System.out.println("==========通过设置A影响B==========");  
	        collA.setNumber(1000, am);  
	        System.out.println("collA的number值为："+collA.getNumber());  
	        System.out.println("collB的number值为A的10倍："+collB.getNumber());  
	  
	        System.out.println("==========通过设置B影响A==========");  
	        collB.setNumber(1000, am);  
	        System.out.println("collB的number值为："+collB.getNumber());  
	        System.out.println("collA的number值为B的0.1倍："+collA.getNumber());  
	          
	    }  
}
