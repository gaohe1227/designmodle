package 工厂模式.简单工厂模式;
/**
 * 
 * Description:抽象产品角色
 * @author:高鹤
 * @date:2017年7月13日
 */
public abstract class Operation {
	protected double numA;

	protected double numB;

	public double getNumA() {
		return numA;
	}

	public void setNumA(double numA) {
		this.numA = numA;
	}

	public double getNumB() {
		return numB;
	}

	public void setNumB(double numB) {
		this.numB = numB;
	}

	public abstract double getResult();
}
