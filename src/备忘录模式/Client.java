package ����¼ģʽ;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Originator originator = new Originator();
		originator.setState("״̬1");
		System.out.println("��ʼ״̬" + originator.getState());
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(originator.createMenmto());// �����˴�������¼�����������
		originator.setState("״̬2");
		System.out.println("�ı���״̬" + originator.getState());
		originator.restoreMemento(caretaker.getMemento());// �����˻ظ�״̬
		System.out.println("�ָ���״̬:" + originator.getState());
	}

}
