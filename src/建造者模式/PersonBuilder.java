package 建造者模式;

/**
 * 
 * Description:为创建一个Product对象的各个部件指定抽象接口(构建者类)
 * 
 * @author:高鹤
 * @date:2017年7月10日
 */
public interface PersonBuilder {
	void buildHead();

	void buildBody();

	void buildFoot();

	Person buildPerson();
}
