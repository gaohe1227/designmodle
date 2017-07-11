package 享元模式;
/**
 * 
 * Description:抽象享元角色::为具体享元角色规定了必须实现的方法，
 * 而外蕴状态就是以参数的形式通过此方法传入。在Java中可以由抽象类、接口来担当
 * @author:高鹤
 * @date:2017年7月11日
 */
public abstract class Flyweight {
	public abstract void operation();  
}
