package 备忘录模式;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Originator originator = new Originator();
		originator.setState("状态1");
		System.out.println("初始状态" + originator.getState());
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(originator.createMenmto());// 发起人创建备忘录并交与管理者
		originator.setState("状态2");
		System.out.println("改编后的状态" + originator.getState());
		originator.restoreMemento(caretaker.getMemento());// 发起人回复状态
		System.out.println("恢复后状态:" + originator.getState());
	}

}
