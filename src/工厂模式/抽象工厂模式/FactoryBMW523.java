package 工厂模式.抽象工厂模式;
/**
 * 
 * Description:具体工厂类:创建相关联的产品
 * @author:高鹤
 * @date:2017年7月13日
 */
public class FactoryBMW523 implements AbstractFactory {
	@Override
	public Engine createEngine() {
		return new EngineB();
	}

	@Override
	public Aircondition createAircondition() {
		return new AirconditionB();
	}
}
