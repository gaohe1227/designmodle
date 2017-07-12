package 备忘录模式;

public class Client1 {
	 public static void main(String[] args){  
	        Originator1 ori = new Originator1();  
	        Caretaker1 caretaker = new Caretaker1();  
	        ori.setState1("中国");  
	        ori.setState2("强盛");  
	        ori.setState3("繁荣");  
	        System.out.println("===初始化状态===\n"+ori);  
	          
	        caretaker.setMemento1("001",ori.createMemento());  
	        ori.setState1("软件");  
	        ori.setState2("架构");  
	        ori.setState3("优秀");  
	        System.out.println("===修改后状态===\n"+ori);  
	          
	        ori.restoreMemento1(caretaker.getMemento1("001"));  
	        System.out.println("===恢复后状态===\n"+ori);  
	    }  
}
