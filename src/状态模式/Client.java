package ״̬ģʽ;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		State state=new ConcreteStateA();
		Context context=new Context();
		context.setState(state);
		context.request("����");
	}

}
