package 工厂模式.工厂方法模式;
/**
 * 
 * Description:抽象工厂
 * @author:高鹤
 * @date:2017年7月13日
 */
public interface ExportFactory {
    public ExportFile factory(String type);
}
