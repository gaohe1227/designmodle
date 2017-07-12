package 备忘录模式;
/**
 * 
 * Description:发起人:负责创建一个备忘录,用以记录当前时刻自身的内部状态,并可使用备忘录恢复自身的状态.
 *              Originator可以决定Memento中存储自身的哪些状态.
 * @author:高鹤
 * @date:2017年7月12日
 */
public class Originator {
	 private String state = "";

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	} 
	/**
	 * 创建备忘录
	 * @Title: createMenmto
	 * @Description: TODO
	 * @param @return
	 * @return Memento
	 * @throws
	 */
	public Memento createMenmto(){
		Memento memento=new Memento(this.state);
		return memento;
	}
	/**
	 * 从备忘录中恢复数据
	 * @Title: restoreMemento
	 * @Description: TODO
	 * @param @param memento
	 * @return void
	 * @throws
	 */
	public void restoreMemento(Memento memento){
		this.setState(memento.getState());
		
	}
}
