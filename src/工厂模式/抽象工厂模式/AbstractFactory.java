package 工厂模式.抽象工厂模式;
/**
 * 
 * Description:抽象工厂类
 * @author:高鹤
 * @date:2017年7月13日
 */
public interface  AbstractFactory {
	 //制造发动机  
    public Engine createEngine();  
    //制造空调   
    public Aircondition createAircondition();  
}
