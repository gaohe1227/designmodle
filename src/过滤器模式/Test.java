package ������ģʽ;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ʼ������
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("��һ", "FEMALE", "MARRIED"));
		persons.add(new Person("�˶�", "MALE", "MARRIED"));
		persons.add(new Person("����", "MALE", "SINGLE"));
		persons.add(new Person("����", "FEMALE", "MARRIED"));
		persons.add(new Person("����", "MALE", "SINGLE"));
		persons.add(new Person("����", "FEMALE", "SINGLE"));
		persons.add(new Person("����", "MALE", "SINGLE"));
		persons.add(new Person("�ް�", "MALE", "MARRIED"));
		persons.add(new Person("����", "FEMALE", "SINGLE"));
		persons.add(new Person("ʷʮ", "FEMALE", "SINGLE"));
		// ��ӡ���������Ե���Ϣ
		System.out.println("---------------------��������---------------------");
		List<Person> maleList = new CriteriaMale().meetCriteria(persons);
		printList(maleList);

		// ��ӡ������Ů�Ե���Ϣ
		System.out.println("--------------------����Ů��-------------------");
		List<Person> marriedFemaleList = new CriteriaFemale().meetCriteria(persons);
		printList(marriedFemaleList);
		// ��ӡ������������Ů�Ե���Ϣ
		System.out.println("-------------------���е�������------------------");
		List<Person> singleOrFemaleList = new FilterAnd(new CriteriaMale(), new SingleFilter()).meetCriteria(persons);
		printList(singleOrFemaleList);
	}

	// ��ӡ�б��е�������Ϣ
	private static void printList(List<Person> list) {
		for (Person person : list) {
			System.out.println(person.toString());
		}
	}

}
