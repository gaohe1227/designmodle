package 备忘录模式;

/**
 * 
 * Description:发起人
 * 
 * @author:高鹤
 * @date:2017年7月12日
 */
public class Originator1 {
	private String state1 = "";
	private String state2 = "";
	private String state3 = "";

	public String getState1() {
		return state1;
	}

	public void setState1(String state1) {
		this.state1 = state1;
	}

	public String getState2() {
		return state2;
	}

	public void setState2(String state2) {
		this.state2 = state2;
	}

	public String getState3() {
		return state3;
	}

	public void setState3(String state3) {
		this.state3 = state3;
	}

	public Memento1 createMemento() {
		return new Memento1(BeanUtils.backupProp(this));
	}

	public void restoreMemento1(Memento1 memento1) {
		BeanUtils.restoreProp(this, memento1.getStateMap());
	}

	public String toString() {
		return "state1=" + state1 + "state2=" + state2 + "state3=" + state3;
	}
}
