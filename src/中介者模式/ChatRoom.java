package �н���ģʽ;

import java.util.Date;

/**
 * 
 * Description:��������������User
 * 
 * @author:�ߺ�
 * @date:2017��7��10��
 */
public class ChatRoom {
 
 

	public static void showMessage(User user1,	   User user2, String message) {
		// TODO Auto-generated method stub
		System.out.println(new Date().toString() + " ["+user1.getName()+"====>"+  user2.getName() + "] : " + message);
	}

	public static void main(String[] args) {
		User robert = new User("Robert");
		User john = new User("John");
		ChatRoom.showMessage(robert, john, "hello");
		ChatRoom.showMessage(john,robert , "hello");
	}

}

class User {
	private String name;
 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(String name) {
		this.name = name;
	}

	 
}