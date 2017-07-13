package 工厂模式.简单工厂模式;
/**
 * 
 * Description:具体产品角色
 * @author:高鹤
 * @date:2017年7月13日
 */
public class MulOperation extends Operation {

	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		 return numA * numB;  
	}

}
