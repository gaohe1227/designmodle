package ����¼ģʽ;

public class Client1 {
	 public static void main(String[] args){  
	        Originator1 ori = new Originator1();  
	        Caretaker1 caretaker = new Caretaker1();  
	        ori.setState1("�й�");  
	        ori.setState2("ǿʢ");  
	        ori.setState3("����");  
	        System.out.println("===��ʼ��״̬===\n"+ori);  
	          
	        caretaker.setMemento1("001",ori.createMemento());  
	        ori.setState1("���");  
	        ori.setState2("�ܹ�");  
	        ori.setState3("����");  
	        System.out.println("===�޸ĺ�״̬===\n"+ori);  
	          
	        ori.restoreMemento1(caretaker.getMemento1("001"));  
	        System.out.println("===�ָ���״̬===\n"+ori);  
	    }  
}
