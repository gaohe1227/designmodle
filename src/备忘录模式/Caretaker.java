package 备忘录模式;

/**
 * 
 * Description:备忘录管理者：负责管理备忘录，但不能对备忘录进行访问
 * 
 * @author:高鹤
 * @date:2017年7月12日
 */
public class Caretaker {
	Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
