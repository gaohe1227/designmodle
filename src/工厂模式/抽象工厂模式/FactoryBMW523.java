package ����ģʽ.���󹤳�ģʽ;
/**
 * 
 * Description:���幤����:����������Ĳ�Ʒ
 * @author:�ߺ�
 * @date:2017��7��13��
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
