package ״̬ģʽ;
/**
 * 
 * Description:������
 * @author:�ߺ�
 * @date:2017��7��12��
 */
public class Context {
	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	/**
	 * �û�����Ȥ�Ľӿ�
	 * @Title: request
	 * @Description: TODO
	 * @param @param sampleParameter
	 * @return void
	 * @throws
	 */
	public void request(String sampleParameter){
		state.doAction(sampleParameter);
	}

}
