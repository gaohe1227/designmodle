package ����ģʽ.�򵥹���ģʽ;
/**
 * 
 * Description:�����Ʒ��ɫ
 * @author:�ߺ�
 * @date:2017��7��13��
 */
public class DivOperation extends Operation {

	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		if(numB == 0)  
            throw new RuntimeException("��������Ϊ0��");  
        return numA / numB;
	}

}
