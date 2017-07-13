package ����ģʽ.��������ģʽ;
/**
 * 
 * Description:���幤��
 * @author:�ߺ�
 * @date:2017��7��13��
 */
public class ExportHtmlFactory implements ExportFactory {
	 @Override
	    public ExportFile factory(String type) {
	        // TODO Auto-generated method stub
	        if("standard".equals(type)){
	            
	            return new ExportStandardHtmlFile();
	            
	        }else if("financial".equals(type)){
	            
	            return new ExportFinancialHtmlFile();
	            
	        }else{
	            throw new RuntimeException("û���ҵ�����");
	        }
	    }
}
