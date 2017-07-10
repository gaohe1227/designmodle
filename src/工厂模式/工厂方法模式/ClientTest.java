package 工厂模式.工厂方法模式;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "";
        ExportFactory exportFactory = new ExportHtmlFactory();
        ExportFile ef = exportFactory.factory("financial");
        ef.export(data);
	}

}
