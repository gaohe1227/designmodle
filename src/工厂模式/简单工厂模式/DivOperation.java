package 工厂模式.简单工厂模式;

public class DivOperation extends Operation {

	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		if(numB == 0)  
            throw new RuntimeException("除数不能为0！");  
        return numA / numB;
	}

}
