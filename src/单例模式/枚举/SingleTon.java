package 单例模式.枚举;

public enum SingleTon {
	instance;
	private String value="12";

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	public static void main(String[] args) {
		SingleTon singleTon=SingleTon.instance;
		SingleTon singleTon1=SingleTon.instance;
		System.out.println(singleTon==singleTon1);
	}
}
