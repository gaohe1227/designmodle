package ����ģʽ.�򵥹���ģʽ;

public class DivOperation extends Operation {

	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		if(numB == 0)  
            throw new RuntimeException("��������Ϊ0��");  
        return numA / numB;
	}

}
