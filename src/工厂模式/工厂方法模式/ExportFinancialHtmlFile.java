package 工厂模式.工厂方法模式;
/**
 * 
 * Description:抽象产品
 * @author:高鹤
 * @date:2017年7月13日
 */
public class ExportFinancialHtmlFile implements ExportFile {

	@Override
	public boolean export(String data) {
		// TODO Auto-generated method stub
		/**
		 * 业务逻辑
		 */
		System.out.println("导出财务版HTML文件");
		return true;
	}

}
