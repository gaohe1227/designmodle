package 中介者模式;

import java.util.Date;

/**
 * 
 * Description:案例：简单聊天类User
 * 
 * @author:高鹤
 * @date:2017年7月10日
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