package ����ģʽ.���󹤳�ģʽ;
/**
 * 
 * Description:���幤����:����������Ĳ�Ʒ
 * @author:�ߺ�
 * @date:2017��7��13��
 */
public class FactoryBMW320 implements AbstractFactory {

	@Override
	public Engine createEngine() {
		// TODO Auto-generated method stub
		  return new EngineA();    
	}

	@Override
	public Aircondition createAircondition() {
		// TODO Auto-generated method stub
		 return new AirconditionA();   
	}

}
