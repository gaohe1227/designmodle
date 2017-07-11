package 过滤器模式;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 初始化数据
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("霍一", "FEMALE", "MARRIED"));
		persons.add(new Person("邓二", "MALE", "MARRIED"));
		persons.add(new Person("张三", "MALE", "SINGLE"));
		persons.add(new Person("李四", "FEMALE", "MARRIED"));
		persons.add(new Person("王五", "MALE", "SINGLE"));
		persons.add(new Person("赵六", "FEMALE", "SINGLE"));
		persons.add(new Person("孙七", "MALE", "SINGLE"));
		persons.add(new Person("罗八", "MALE", "MARRIED"));
		persons.add(new Person("刘九", "FEMALE", "SINGLE"));
		persons.add(new Person("史十", "FEMALE", "SINGLE"));
		// 打印出所有男性的信息
		System.out.println("---------------------所有男性---------------------");
		List<Person> maleList = new CriteriaMale().meetCriteria(persons);
		printList(maleList);

		// 打印出所有女性的信息
		System.out.println("--------------------所有女性-------------------");
		List<Person> marriedFemaleList = new CriteriaFemale().meetCriteria(persons);
		printList(marriedFemaleList);
		// 打印出所有男生和女性的信息
		System.out.println("-------------------所有单身男性------------------");
		List<Person> singleOrFemaleList = new FilterAnd(new CriteriaMale(), new SingleFilter()).meetCriteria(persons);
		printList(singleOrFemaleList);
	}

	// 打印列表中的数据信息
	private static void printList(List<Person> list) {
		for (Person person : list) {
			System.out.println(person.toString());
		}
	}

}
