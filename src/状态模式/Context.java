package 状态模式;
/**
 * 
 * Description:环境类
 * @author:高鹤
 * @date:2017年7月12日
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
	 * 用户感兴趣的接口
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
