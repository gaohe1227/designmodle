package 建造者模式;

public class Person {
	public Person() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("创建一个人");
	}

	private String head;

	private String body;

	private String foot;

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getFoot() {
		return foot;
	}

	public void setFoot(String foot) {
		this.foot = foot;
	}
}
